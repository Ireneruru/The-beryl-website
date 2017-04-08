#!/bin/sh

java -Djava.library.path=/usr/local/lib -Xss64m -Xmx2000m -cp Beryl.jar org.antlr.v4.gui.TestRig DS3Lab.Beryl.parser.Beryl program $1
