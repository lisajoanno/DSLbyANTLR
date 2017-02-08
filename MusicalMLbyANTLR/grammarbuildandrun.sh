#!/bin/sh

mvn -q clean generate-sources package
mvn exec:java
