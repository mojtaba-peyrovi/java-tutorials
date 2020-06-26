JAVA Basics ---

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
The way we do subtraction and multiplication, are the same. But when we want to do division, because the result can be decimal, we should declare all variables as double.

We also have the remainder of division. we show it by %. Like Python. (x % y)

#### Incrementation:

When we want to increment the value of x by 1 we just need to say `x++` like PHP or js, etc.

- In this case, Java will return x+1 for the next use of x, but sometime we want the incrementation to be implemented into the current x use, if that's the case, we need to say `++X`.

- Also like other languages, x += 5 means x = x + 5
- Similarly, x *= 5, means x = x * 5
- And x/=5 means x = x/5, and x-= 5 means x = x - 5


#### Conditional Statements:

__IF STATEMENT:__ is exactly like PHP.

#### Logical Operators:

In case of having AND and OR in java, we use these:
```
&& for AND
|| for OR
```

#### Switch/Case conditions:

Here is the syntax for multiple conditions that we use switch/case.
```
int score = 90;
          switch (score)
          {
              case 90:
                  System.out.println("VERY GOOD");
                  break;
              case 60:
                  System.out.println("GOOD");
                  break;
              case 30:
                  System.out.println("OK");
              default:
                  System.out.println("NO CASE IS TRUE")                      
          }
```
We can also define the default situation where none of the cases are true.

When we want to multiple conditions, to do the same thing, we just mention like this:
```
    case 100:
    case 90:
    case 110:
        System.out.println("VERY GOOD")
```
All three values return the same response.

#### Arrays in JAVA:
Here is how we declare and define integer arrays:
```
int[] myArray = {1,2,3,4,5}
or 
int myArray[] = {1,2,3,4,5}
```    
The first way is more recommended.

#### For Loops:
In order to make it, inside for we need to add three things: 
	- init
	- expression
	- incrementation
example: 
```
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myintarray = {123,45,76,56,34};
		for (int index=0; index < 5; index++)
		{
			System.out.println(myintarray[index]);
		}
```
the code above prints the first five values inside the array **myintarray.**

An easier way, is to say:
```
for(int element : myintarray)
		{
			System.out.println(element);
		}
```
it does the same thing.

### Strings in JAVA:
to declare a string we just mention String in the beginning of the line:
```
String myString = "hello world..."
```
**length() function:** it returns the length of the string. e.g. myString.length() 
**toLowercase():** makes all characters lowercase.
**toUppercase():** makes all characters uppercase.
**Concatenation:** in order to concat strings we use + just like python.
**Replace:** we can replace a character with another one like this:
```
newString = mystring.replace(oldValue, newValue)
```
### Defining Methods:
methods are similar to python. we do this way:
```
public static void testMethod(){
// TODO:blah blah
}
```
in this example **void** means the method does not return anything.
when we want to run the method, we can call it inside the main method and it will execute.

### Passing parameters to methods:
It is not so different from Python, we just need to declare the datatype inside the bracket for each parameter. example:
```
public static void add(int a, int b) {
		System.out.println(a+b);
	}
```
If the method doesn't return anything we use the keyword **void,** but if we want the function to return something, we need to declare the type of the value we want the function to return.	 Then we can assign the returned value of the method to another variable. Here is the method:
```
public static int add(int a, int b) {
		return(a+b);
	}
```
inside the main function:
```
public static void main() {
		int sum = addition(12,14);
		System.out.println(sum);
	}
Output: 26	
```
### Classes and Objects
Now let's create two classes, one is Classes, one is Students. inside Student class, we declare id, name, age. 	
Then inside the main class of the other class(Classes) we can create a new student like this:
```
package lesson1;

public class Classes {
	public static void main(String[] args) {
		Student mark = new Student();
	}
}
```
Now mark is an object on instance of student class. now the variables we declared inside Students class, will be accessible by . as the object's property. like this:
```
public class Classes {
	public static void main(String[] args) {
		Students mark = new Students();
		
		mark.id = 1;
		mark.name = "Mark";
		mark.age = 15;
		System.out.println(mark.name +" " + mark.age);
	}
}
output: Mark 15
```
In programming its not a good practice to directly define the properties. instead, in Java we use Getter and Setter methods, that we can add to Students class. (select one of the properties like Id, then go under Source tab and find "Generate Getters and Setters" then select all, then we have a bunch of getter and setter methods. like this:
```
public class Students {
	int id;
	String name;
	int age; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
```
Using this approach, we instead of saying mark.id = 1, we say:
mark.setId(1)

#### This technique is called Encapsulating a variable.
We do this because we don't want any other users to access our object properties directly and manipulate them.
This is how the Classes class looks like calling get and set methods:
```
public class Classes {
	public static void main(String[] args) {
		Students mark = new Students();
		
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		System.out.println(mark.getName() +" " + mark.getAge());
	}
}
```

