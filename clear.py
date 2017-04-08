#!/Users/ruru/anaconda/bin/python
# -*- coding: UTF-8 -*-

import cgi, cgitb
import os, sys, subprocess

os.chdir("./runtime")

print "Content-type:text/html\n"

try:
	procc = open("procc")
	for pid in procc:
		os.system("kill -9 " + pid)
	procc.close()
	os.system("rm procc")
except IOError:
	pass

try:
	proc = open("proc")
	for pid in proc:
		os.system("kill -9 " + pid)
	proc.close()
	os.system("rm proc")
except IOError:
	pass

print 'ok'

