#!/Users/ruru/anaconda/bin/python
# -*- coding: UTF-8 -*-

import cgi, cgitb
import os, sys, subprocess
import cv2
import numpy as np

os.chdir("./runtime")

log = open("log", "a")

sourcetext = sys.stdin.read()
log.write(sourcetext + "\n")
log.flush()

print "Content-type:text/html\n"

try:
    if sourcetext == 'refresh':
        res = open("res.txt")
        txt = res.read()
        print txt
    else:
        src = open("src.txt" , "w")
        src.write(sourcetext)
        src.close()

        os.system("sh tex.sh src.txt > res.txt 2>&1")
        successful = True
        for l in open("res.txt"):
            successful = False
            print l
        if successful:
            os.system("cp latex.txt latex.tex > /dev/null")
            os.system("export PATH=/Library/TeX/texbin:$PATH; texi2pdf latex.tex > /dev/null")
            os.system("/usr/local/bin/pdfseparate latex.pdf %d.pdf > /dev/null")
            os.system("ls [0-9]*.pdf | xargs -I '{}' sips -s format jpeg '{}' --out '{}'.jpg > /dev/null")
            i=1
            #top botton left right
            top,bottom,left,right = -1,-1,-1,-1
            while True:
                img = cv2.imread("%d.pdf.jpg" %i)
                if(img is None):
                    break
                #figure out the top
                line = img.shape[0]
                row = img.shape[1]
                for j in range(0,row, 1):
                    if(np.mean(img[:,j])!=255.0):
                        if(left==-1):
                            left = j
                        else:
                            left= min(left,j)
                        break
                for j in range(row-1,-1,-1):
                    if(np.mean(img[:,j])!=255.0):
                        if(right==-1):
                            right = j
                        else:
                            right = max(right,j)
                        break
                i+=1


            totalfileNum=i-1
            img = cv2.imread("1.pdf.jpg")
            for j in range(0,line, 1):
                if(np.mean(img[j])!=255.0):
                    if(top==-1):
                        top = j
                    else:
                        top = min(top, j)
                    break
            for j in range(line-1,-1, -1):
                if(np.mean(img[j])!=255.0):
                    if(bottom==-1):
                        bottom = j
                    else:
                        bottom=max(bottom,j)
                    break
            target = img[top:bottom,left:right]

            for i in range(2, totalfileNum + 1):
                img = cv2.imread("%d.pdf.jpg" %i)
                if(img==None):
                    break
                #select the right region
                top = -1
                bottom = -1
                for j in range(0,line, 1):
                    if(np.mean(img[j])!=255.0):
                        if(top==-1):
                            top = j
                        else:
                            top = min(top, j)
                        break
                for j in range(line-1,-1, -1):
                    if(np.mean(img[j])!=255.0):
                        if(bottom==-1):
                            bottom = j
                        else:
                            bottom=max(bottom,j)
                        break
                temp = img[top:bottom,left:right]
                target = np.concatenate((target, temp), axis=0)


            #write back the image
            cv2.imwrite("../target.jpg", target)

            try:
                procc = open("procc")
                for pid in procc:
                    os.system("kill -9 " + pid)
                procc.close()
                os.system("rm procc")
            except IOError:
                pass
            procc = open("procc", "a")
            p = subprocess.Popen("python ../process.py",shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE)
            procc.write(str(p.pid) + "\n")
            procc.flush()
            print "ok"
except e:
    print "failed"
    log.write(e)
    log.flush()

log.close()
