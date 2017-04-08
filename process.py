#!/Users/ruru/anaconda/bin/python
# -*- coding: UTF-8 -*-

import cgi, cgitb
import os, sys, subprocess
from threading import Thread
from Queue import Queue, Empty

# implement read line without blocking

ON_POSIX = 'posix' in sys.builtin_module_names

def enqueue_output(out, queue):
    for line in iter(out.readline, b''):
        queue.put(line)
    out.close()

try:
	proc = open("proc")
	for pid in proc:
		os.system("kill -9 " + pid)
	proc.close()
	os.system("rm proc")
except IOError:
	pass

res = open("res.txt", "w")
proc = open("proc", "w")

p=subprocess.Popen("sh run.sh src.txt",shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE)
proc.write(str(p.pid) + "\n")
proc.flush()

q_stdout = Queue()
q_stderr = Queue()
t_stdout = Thread(target=enqueue_output, args=(p.stdout, q_stdout))
t_stderr = Thread(target=enqueue_output, args=(p.stderr, q_stderr))
t_stdout.daemon = True # thread dies with the program
t_stdout.start()
t_stderr.daemon = True
t_stderr.start()


while p.poll() == None:
	try:
		out = q_stdout.get_nowait()
	except Empty:
		out = ''
	try:
		err = q_stderr.get_nowait()
	except Empty:
		err = ''
	if len(err) > 0:
		res.write(err)
		res.flush()
	if out == "run\n":
		os.system("cp code.py ../code.txt")
		c=subprocess.Popen("/Users/ruru/anaconda/bin/python code.py",shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE)
		proc.write(str(c.pid) + "\n")
		proc.flush()

		qc_stdout = Queue()
		qc_stderr = Queue()
		tc_stdout = Thread(target=enqueue_output, args=(c.stdout, qc_stdout))
		tc_stderr = Thread(target=enqueue_output, args=(c.stderr, qc_stderr))
		tc_stdout.daemon = True # thread dies with the program
		tc_stdout.start()
		tc_stderr.daemon = True
		tc_stderr.start()
		while True:
			try:
				out = qc_stdout.get_nowait()
			except Empty:
				out = ''
			try:
				err = qc_stderr.get_nowait()
			except Empty:
				err = ''
			if len(err) > 0:
				res.write(err)
				res.flush()
			if len(out) > 0:
				res.write(out)
				res.flush()
