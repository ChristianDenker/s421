**IHO S-421 v0.5**

This is a java implementation of S-421 Route Plan Exchange based on S-100.
It's generated from xsd-Files that are located on CIRM's website.

**Usage Example**

A basic example for de-/serialization is provided in de.jade.s421.Demo.java

**Construction**

How to generate S-421 java classes with xjc (version 2.2.8-b130911.1802) on your own:

1) bash into ./S-421_Ver05/schemas/S421
2) execute xjc -d ..\..\..\src\main\java S421.xsd -b bindings_xlink.xjb

**Test**

This package has not been tested.
