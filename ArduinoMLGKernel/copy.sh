#!/usr/bin/env bash

rm -f src/main/java/grammar/*

sed -i '1ipackage grammar;' src/main/java/grammarGenerated/*.java

cp src/main/java/grammarGenerated/* src/main/java/grammar/

rm -f src/main/java/grammarGenerated/*
