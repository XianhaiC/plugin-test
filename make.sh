#!/usr/bin/bash

# compile the main class with the spigot jar
javac -cp ../../libraries/spigot/spigot-1.16.3.jar src/MainPlugin.java -d classes
# bundle together into an archive
jar cvf builds/MainPlug.jar -C classes .
