#!/usr/bin/env bash

cp input.txt MusicalMLbyANTLR/input.txt
cd MusicalMLbyANTLR
mvn exec:java
cd ..
cp MusicalMLbyANTLR/output.txt ArduinoMLGKernel/input.txt
cd ArduinoMLGKernel
mvn exec:java
cd ..
cp ArduinoMLGKernel/output.txt ./output.txt


