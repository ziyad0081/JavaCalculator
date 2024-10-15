#! /usr/bin/bash


rm *.class */*.class

javac ApplicationLauncher.java

jar cmf MANIFEST.MF build/Calculator.jar ApplicationLauncher.class Computer/*.class

chmod +x build/Calculator.jar


rm *.class */*.class


