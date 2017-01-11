#!/bin/sh
mvn clean package
sh copy.sh
mvn clean package
mvn exec:java