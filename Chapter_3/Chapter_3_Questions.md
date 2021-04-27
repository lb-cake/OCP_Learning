1. Which of the following Java operators can be used with ```boolean``` variables?
    1. ==
    2. +
    3. --
    4. !
    5. %
    6. <=
    7. Cast with (```boolean```)
    
2. What data type (or types) will allow the following code snippet to compile?
```jshelllanguage
byte apples = 5;
short oranges = 10;
_____ bananas = apples + oranges;
```
    1. int
    2. long
    3. boolean
    4. double 
    5. short
    6. byte

3. What change, when applied independently, would allow the following code snippet to compile?
```jshelllanguage
long ear = 10;
int hearing = 2 * ear;
```
    1. No change; it compiles as is.
    2. Cast ear on line 2 to int.
    3. Change the data type of ear on line 1 to short.
    4. Cast 2 * ear on line 2 to int.
    5. Change the data type of hearing on line 2 to short.
    6. Change the data type of hearing on line 2 to long.

4. What is the output of the following code snippet?
```jshelllanguage
boolean canine = true, wolf = true;
int teeth = 20;
canine = (teeth != 10) ^ (wolf = false);
System.out.println(canine+", "+teeth+", "+wolf)
```
   1. true, 20, true
   2. true, 20, false
   3. false, 10, true
   4. false, 20, false
   5. The code will not compile because of line 3
   6. None of the above

5. Which of the following operators are ranked in increasing or the same order of precedence. Assuming the + operator is binary addition, not the unary form.
   1. +, *, %, --
   2. ++, (int), *
   3. =, ==, !
   4. (short), =, !, *
   5. *, /, %, +, ==
   6. !, ||, &
   7. ^, +, =, +=
   
6. What is the output of the following program?
```java
public class CandyCounter {
    static long addCandy(double fruit, float vegetables) {
        return (int) fruit + vegetables;
    }

   public static void main(String[] args) {
      System.out.println(addCandy(1.4, 2.4f) + "-");
      System.out.println(addCandy(1.9, (float)4) + "-");
      System.out.println(addCandy((long)(int)(short)2, (float)4));
   }
}
```
   1. 4-6-6.0
   2. 3-5-6
   3. 3-6-6
   4. 4-5-6
   5. The code does not compile because of line 9.
   6. None of the above.

7. What is the output of the following code snippet?
```jshelllanguage
int ph = 7, vis = 2;
boolean clear = vis > 1 & (vis < 9 || ph < 2);
boolean safe = (vis > 2) && (ph++ > 1);
boolean tasty = 7 <= --ph;
System.out.println(clean+"-"+safe+"-"+tasty);
```
   1. true-true-true
   2. true-true-false
   3. true-false-true
   4. true-false-false
   5. false-true-true
   6. false-true-false
   7. false-false-true
   8. false-false-false

8. What is the output of the following snippet?
```jshelllanguage
int pig = (short)4;
pig = pig++;
long goat = (int)2;
goat -= 1.0;
System.out.println(pig + " - " + goat);
```
   1. 4 - 1
   2. 4 - 2
   3. 5 - 1
   4. 5 - 2
   5. The code does not compile due to line 7.
   6. None of the above.

9. What are the unique outputs of the following code snippet?
```jshelllanguage
int a = 2, b = 4, c = 2;
System.out.println(a > 2 ? --c : b++);
System.out.println(b = (a!=c ? a : b++));
System.out.println(a > b ? b < c ? b : 2 : 1);
```
   1. 1
   2. 2
   3. 3
   4. 4
   5. 5
   6. 6
   7. The code does not compile.

10. What are the unique outputs of the following code snippets?
```jshelllanguage
short height = 1, weight = 3;
short zebra = (byte) weight * (byte) height;
double ox = 1 + height * 2 + weight;
long giraffe = 1 + 9 % height + 1;
System.out.println(zebra);
System.out.println(ox);
System.out.println(giraffe);
```

   1. 0-0-5
   2. 1-2-10
   3. 2-1-5
   4. 2-0-5
   5. 3-1-10
   6. 3-2-6
   7. The code does not compile.