#!/bin/sh

echo "Are you sure ? (y)"

read input_variable

if [ $input_variable = "y" ]
then
    echo "Ok let's do this."
    echo "Processing..."
    mvn -q clean package
    sh copy.sh
    mvn -q clean package
    mvn -q exec:java
else
    echo "Ok."
fi


