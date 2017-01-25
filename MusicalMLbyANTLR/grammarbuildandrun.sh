#!/bin/sh

echo "Are you sure ? (y)"

read input_variable

if [ $input_variable = "y" ]
then
    echo "Ok let's do this."
    echo "Processing..."
    mvn -q clean package -DskipTests
    sh copy.sh
    mvn -q clean package
    mvn exec:java
else
    echo "Ok."
fi


