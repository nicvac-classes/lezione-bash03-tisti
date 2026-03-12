#!/bin/bash
echo "Compilazione in corso..."
javac -d build/ src/main/*.java src/utils/*.java
echo "Build completata!"
