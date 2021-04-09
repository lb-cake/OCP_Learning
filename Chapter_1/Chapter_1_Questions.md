1. Which of the following are true statements? (Choose all that apply)
    1. Java allows operator overloading
    2. Java code compiled on Windows can run on Linux
    3. Java has pointers to specific locations in memory
    4. Java is a procedural language
    5. Java is an object-oriented language.
    6. Java is a functional programming language
    

2. Which of the following are true? (Choose all that apply)
    1. ```javac``` compiles a .class into a .java file.
    2. ```javac``` compiles a .java file into a .bytecode file.
    3. ```javac``` compiles a .java file into a .class file.
    4. ```java``` accepts the name of the class as a parameter
    5. ```java``` accepts the filename of the .bytecode file as a parameter
    6. ```java``` accepts the filename of the .class file as a parameter
    

3. Which of the following are true if this command completes successfully assuming the CLASSPATH is not set?
   ```java MyProgram.java```
    1. A .class file is created
    2. MyProgram can reference classes in the package com.symbex.book
    3. MyProgram can reference classes in the package java.lang
    4. MyProgram can reference classes in the package java.util
    5. None of the above. The program needs to be run as ```java MyProgram```
   

4. Given the following classes, which of the following can independently replace ```INSERT IMPORTS HERE``` to make the code compile?
    ```java
    package aquarium;
   public class Tank {}
   
   package aquarium.jellies;
   public class Jelly {}
   
   package visitor;
   INSERT IMPORTS HERE
   public class AquariumVistor {
       public void admire(Jelly jelly) {} }
         
    ```
   1. ```import aquarium.*;```
   2. ```import aquarium.*.Jelly;```
   3. ```import aquarium.jellies.Jelly;```
   4. ```import aquarium.jellies.*;```
   5. ```import aquarium.jellies.Jelly.*;```
   6. None of these can make the code compile
   

5. Which are included in the JDK?
   1. javac
   2. Eclipse
   3. JVM
   4. javadoc
   5. jar
   6. None of the above
   

6. Given the following classes, what is the maximum number of imports can be removed and have the code still compile?
```java

package aquarium;
public class Water {}

package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
    public void print(Water water) {
       System.out.println(water);
    }
}
```
   1. 0
   2. 1
   3. 2
   4. 3
   5. 4
   6. Does not compile


7. Given the following classes, which of the following snippets can independently be inserted in place of ```INSERT IMPORTS HERE``` and have the code compile?
```java
package aquarium;
public class Water {
    boolean salty = false;
}

package aquarium.jellies;
public class Water {
    boolean salty = true;
}

package employees;
INSERT IMPORTS HERE
public class WaterFiller {
    Water water;
}
```
   1. ```java
         import aquarium.*;
      ```
   2. ```java
      import aquarium.Water;
      import aquarium.jellies.*;
      ```
   3. ```java
      import aquarium.*;
      import aquarium.jellies.Water;
      ```
   4. ```java
      import aquarium.*;
      import aquarium.jellies.*;
      ```
   5. ```java
      import aquarium.Water;
      import aquarium.jellies.Water;
      ```
   6. None of these import can make the code compile.


8. Given the following command, which of the following classes would be included for compilation?
```shell
javac *.java
```
   1. Hyena.java
   2. Warthog.java
   3. land/Hyena.java
   4. land/Warthog.java
   5. Hyena.groovy
   6. Warthog.groovy


9. Given the following class, which of the calls print out Blue Jay?
```java
public class BirdDisplay {
   public static void main(String[] args) {
      System.out.println(name[1]);
   }
}
```
   1. ```shell
      java BirdDisplay Sparrow Blue Jay
      ```
   2. ```shell
      java BirdDisplay Sparrow "Blue Jay"
      ```
   3. ```shell
      java BirdDisplay Blue Jay Sparrow
      ```
   4. ```shell
      java BirdDisplay Blue Jay Sparrow
      ```
   5. ```shell
      java BirdDisplay.class Sparrow "Blue Jay"
      ```
   6. ```shell
      java BirdDisplay.class "Blue Jay" Sparrow
      ```
10. Which of the following are legal entry point methods that can be run from the command line?
      1. ```java
         private static void main(String[] args)
         ```
      2. ```java
         public static final main(String[] args)
         ```
      3. ```java
         public void main(String[] args)
         ```
      4. ```java
         public static void test(String[] args)
         ```
      5. ```java
         public static void main(String[] args)
         ```
      6. ```java
         public static main(String[] args)
         ```
      

11. Which of the following are true statements about Java?
    1. Bug-free code is guaranteed.
    2. Deprecated features are never removed.
    3. Multithreaded code is allowed.
    4. Security is a design goal.
    5. Sideways compatibility is a design goal.


12. Which options are valid on the javac command without considering module options?
      1. -c
      2. -C
      3. -cp
      4. -CP
      5. -d
      6. -f
      7. -p


13. Which options are valid on the java command without considering module options?
      1. -c
      2. -C
      3. -cp
      4. -d
      5. -f
      6. -p


14. Which options are valid on the jar command without considering module options?
      1. -c
      2. -C
      3. -cp
      4. -d
      5. -f
      6. -p
    

15. What does the following code output when run as ```java Duck Duck Goose```?
```java
public class Duck {
   public static void main(String[] args) {
        for (int i = 1; i <= args.length; i++)
           System.out.println(args[i]);
   }    
}
```
    1. Duck Goose
    2. Duck ArrayIndexOutOfBoundsException
    3. Goose
    4. Goose ArrayIndexOutOfBoundsException
    5. None of the above

17. Which of the following are true?
```java
public class Bunny {
    public static void main(String[] args) {
        Bunny bun = new Bunny();
    }
}
```
    1. Bunny is a class
    2. bun is a class
    3. main is a class
    4. Bunny is a reference to an object
    5. bun is a reference to an object.
    6. main is a reference to an object
    7. The main() method doesn't run because the parameter name is incorrect.

18. Which answer options represent the order in which the following statements can be assembled into a program that will compile successfully?
```java
X: class Rabbit {}
Y: import java.util.*;
Z: package animals;
```
    1. X, Y, Z
    2. Y, Z, X
    3. Z, Y, X
    4. Y, X
    5. Z, X
    6. X, Z

19. Which are not available for download from Oracle for Java 11?
    1. JDK
    2. JRE
    3. Eclipse
    4. All of these are available from Oracle
    
20. Which are valid ways to specify the classpath when compiling?
    1. -cp
    2. -classpath
    3. --classpath
    4. -class-path
    5. --class-path