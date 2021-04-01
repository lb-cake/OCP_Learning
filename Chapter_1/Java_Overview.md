# Learning About the Java Environment

## Major Compontents of Java
The <i>Java Development Kit</i>(JDK) contains the minimum software that you need to do Java development. Key pieces include the compiler (javac), which converts .java files to .class files, and the launcher java, which creates the virtual machine and executes the program. We will use both for studying.

The JDK also contains other tools including the archiver (jar) command, which can package files together, and the API documentation (javadoc) command for generating documentation.

### Where is the JRE now?
In previous versions of Java, you could download a JRE instead of the full JDK. The JRE is a subset of the JDK that was used only for running a program, but could not compile one. It was literally a subset. In fact, in Java 8 and lower, if you looked in the directory structure of the JDK, you would see a directory called jre.

In Java 11, the JRE is no longer available as a stand-alone download or a subdirectory of the JDK. People can install the JDK if they wish to run a Java program. Alternatively, developers can supply an executable that contains the required pieces that would have been the JRE. The jlink command creates this executable.

## Benefits of Java
1. Object Oriented
2. Encapsulation
3. Platform Independent
4. Robust
6. Simple (haha)
7. Secure
8. Multithreaded
9. Backward Compatible

