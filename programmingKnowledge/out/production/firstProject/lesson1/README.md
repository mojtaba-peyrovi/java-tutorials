## JAVA Basics
---

Source: [ProgrammingKnowledge Youtube Channel](https://www.youtube.com/watch?v=r59xYe3Vyks&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al).

First thing, we create a new project anywhere on the computer we want to. Then after project being created, we will see there is `src` folder being made.

The next step, is to create packages, if we want to have different `workspaces` for example, for this tutorial, each lesson will have a package.

If we see inside directories, we see for each package, there will be a folder made inside `src` folder.

Next, We create a java class inside the package, lesson1 and it will look like this:
```
package lesson1;

public class myClass {
    
}
```
It will be ready to code. We have to add another line to look like this:
```
package lesson1;

public class myClass {
    public static void main(String[] args) {
        //your code here
    }
}
```
For each JAVA project, there is at least ONE class, and inside each class there will be at least ONE method, which is called `main`.

Inside the method we can print "Hello World" by saying:
```
System.out.println("Hello World");
```
and we run it and it will print "Hello World" in the console.

#### Variables in JAVA:

here is the list of the variables:

we declare variables like this: `int x = 10`
1) byte: number, 1 byte
2) int: number, 4 bytes
3) long: number, 8 bytes
4) float: float number, 4 bytes
5) double: float number, 8 bytes
6) char: character, 2 bytes
7) boolean: true/false, 1 byte

#### How to get user input?
For this we need to use `Scanner` class:

```
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
}
```
- We need to import Scanner class.

Now we can save the user input as a variable, and print it:
```
public class myClass {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter Some Number:");
          int user_input_number = scan.nextInt();
          System.out.println("The Entered Value is:");
          System.out.println(user_input_number);
    }
}
``` 
In case of double we just change the code this way:
```
/*
        When user inputs A DECIMAL
     */
        Scanner scan_one = new Scanner(System.in);
        System.out.println("Enter Some Decimal Value:");
        double user_input_double = scan_one.nextDouble();
        System.out.println("The Entered Value is:");
        System.out.println(user_input_double);
```
in case of string:
```
 /*
        When user inputs A STRING:
      */
        Scanner scan_two = new Scanner(System.in);
        System.out.println("Enter Some String:");
        String user_input_string = scan_two.nextLine();
        System.out.println("The Entered String is:");
        System.out.println(user_input_string);
```
For other cases, there are some other `nextBlah` options that we can see them after saying `scan.` the IDE will show us all options.

#### Mathematical Operators:

We can say:
```
public static void main(String[] args) {
    int x, y, answer;
    x = 12;
    y = 23;
    answer = x + y;
    System.out.prinln("Answer is:" + answer);
}  // returns Answer is: 35
```
The way we do subtraction and multiplication, are the same. But when we want to do division, because the result can be decimal, we should declare the answer as double.

