1. Which of the following are valid Java identifiers?
    1. _
    2. _helloWorld$
    3. true
    4. java.lang
    5. Public
    6. 1980_s
    7. \_Q2\_
    
2. What lines are printed by the following program?
```java
public class WaterBottle {
    private String brand;
    private boolean empty;
    public static float code;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty = " + wb.empty);
        System.out.println("Brand = " + wb.brand);
        System.out.println("Code = " + code);
    }
}
```
    1. Line 8 generates a compiler error
    2. Line 9 generates a compiler error
    3. Empty = 
    4. Empty = false
    5. Brand = 
    6. Brand = null
    7. Code = 0.0
    8. Code 0f

3. Which of the following code snippets about var compile without issue when used in a method?
    1. ```var spring = null;```
    2. ```var fall  = "leaves";```
    3. ```var evening = 2; evening = null;```
    4. ```var night = new Object();```
    5. ```var day = 1/0;```
    6. ```var winter = 12, cold;```
    7. ``` var fall = 2, autumn = 2;```
    8. ```var morning = ""; morning = null;```
   
4. Which of the following statements about the code snippet are true?
```jshelllanguage
short numPets = 5L;
int numGrains = 2.0;
String name = "Scruffy";
int d = numPets.length();
int e = numGrains.length;
int f = name.length();
```
   1. Line 1 generates a compiler error
   2. Line 2 generates a compiler error
   3. Line 3 generates a compiler error
   4. Line 4 generates a compiler error
   5. Line 5 generates a compiler error
   6. Line 6 generates a compiler error

5. Which statements about the following class are true?
```java
public class River {
    int Depth = 1;
    float temp = 50.0;
    public void flow() {
        for (int i = 0; i < 1; i++) {
            int depth = 2;
            depth++;
            temp--;
        }
       System.out.println(depth);
       System.out.println(temp); 
    }

   public static void main(String[] args) {
      new River().flow();
   }
}
```

   1. Line 3 generates a compiler error
   2. Line 6 generates a compiler error
   3. Line 7 generates a compiler error
   4. Line 10 generates a compiler error
   5. The program prints 3 on line 10
   6. The program prints 4 on line 10.
   7. The program prints 50.0 on line 11.
   8. The program prints 49.0 on line 11.

6. Which of the following are correct?
   1. An instance variable of type float defaults to 0.
   2. An instance variable of type char defaults to null.
   3. An instance variable of type double defaults to 0.0
   4. An instance variable of type int defaults to null.
   5. An instance variable of type String defaults to null.
   6. An instance variable of type String defaults to the empty string "".
   7. None of the above
   
7. Which of the following are correct?
   1. A local variable of type boolean defaults to null.
   2. A local variable of type float defaults to 0.0f.
   3. A local variable of type double defaults to 0.
   4. A local variable of type Object defaults to null.
   5. A local variable of type boolean default to false.
   6. A local variable of type float defaults to 0.0.
   7. None of the above.
   
8. Which of the following are true?
   1. A class variable of type boolean defaults to 0.
   2. A class variable of type boolean defaults to false.
   3. A class variable of type boolean defaults to null.
   4. A class variable of type long defaults to null.
   5. A class variable of type long defaults to 0L.
   6. A class variable of type long defaults to 0.
   7. None of the above.
   
9. Which of the following statements about garbage collection are correct?
   1. Calling ```System.gc()``` is guaranteed to free up memory by destroying objects eligible for garbage collection.
   2. Garbage collection runs on a set schedule.
   3. Garbage collection allows the JVM to reclaim memory for objects.
   4. Garbage collection runs when your program has used up half the available memory.
   5. An object may be eligible for garbage collection but never removed from the heap.
   6. An object is eligible for garbage collection once no references to it are accessible in the program.
   7. Marking a variable ```final``` means its associated object will never be garbage collected.
   
10. Suppose we have a class named ```Rabbit```. Which of the following statements are true?
```java
public class Rabbit {
   public static void main(String[] args) {
      Rabbit one = new Rabbit();
      Rabbit two = new Rabbit();
      Rabbit three = one;
      one = null;
      Rabbit four = one;
      three = null;
      two = null;
      two = new Rabbit();
      System.gc();
   }
}
```
   1. The ```Rabbit``` object created on line 3 is first eligible for garbage collection immediately following line 6.
   2. The ```Rabbit``` object created on line 3 is first eligible for garbage collection immediately following line 8.
   3. The ```Rabbit``` object created on line 3 is first eligible for garbage collection immediately following line 12.
   4. The ```Rabbit``` object created on line 4 is first eligible for garbage collection immediately following line 9.
   5. The ```Rabbit``` object created on line 4 is first eligible for garbage collection immediately following line 11.
   6. The ```Rabbit``` object created on line 4 is first eligible for garbage collection immediately following line 12.
   7. The ```Rabbit``` object created on line 10 is first eligible for garbage collection immediately following line 11.
   8. The ```Rabbit``` object created on line 10 is first eligible for garbage collection immediately following line 12.