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
### Class construction:
We created a class called Cube, and within that class we simply make a function that takes the three dimensions of a cube, and multiply them together to calculate the volume.
Then in a new class we can call this class in.	for example in MyClass class, we will import the Cube class like this:
~~~
Cube cube1 = new Cube();  
~~~
the Cube() is the constructor that Java creates automatically if we don't explicitly define a constructor. 
- The constructor name is exactly the same as the class name.
- constructor method will NEVER return any value.
- Any time we instantiate a class, the first method in the class to run, will be the constructor method.
Here is an example constructor we can define in Cube method for just passing the default dimensions.
```
Cube() {
	length = 10;
	bredth = 20;
	height = 30;
}
```
and whenever inside MyClass we instantiate Cube, we will get the default volume calculations. Like this:
```
Cube cube1 = new Cube();    	
    	System.out.println(cube1.getCoubeVolume());
    }
```
#### Constructor Overlading:
It means we can define as many constructors as we want. and it will overwrite the former one anytime we instantiate the class. For example in Cube class we define a new constructor:
```
Cube(int l, int b, int h) {
		length = l;
		bredth = b;
		height = h;
	}
```
and in MyClass main method:
```
        Cube cube2 = new Cube(20,20,20);
        System.out.println(cube2.getCoubeVolume());
```
### Method Overloading:
We can define multiple methods with the same name inside a class. for example we can have add method three times, and the first one receives int, second one double, and the third one string.  Then we can call the method and pass int parameter, then Java will automatically trigger the method accepting integer, or if we pass strings it will trigger the method with strings.

### Static methods:
static members belong to the class instead of a specific instance. When we instantiate a class, if the method inside the class, is static, we can access it by . but if it's not static, we cannot access it. like the following methods:
```
public class Hello {
	public static String DoSomething(String message) {
		return message;
	}
	
	public String DoSomethingElse(String message) {
		return message;
	}
}
```
If we instantiate the class like this:
```
Hello hi = new Hello();
```
we can access the method DoSomething from the class itself like this:
```
Hello.DoSomething("hello world");
```
but the second method cannot be accessed from the class because it's not static.
Instead, if we want to access doSomethingElse(), we can access it from the instance. like this:
```
Hello hi = new Hello();
hi.DoSomethingElse("hello world");
```
We have the same story for variables too. we can define a variable as:
```
public class Hello() {
public static int Age;
}
** we can access Age from the class diretly by saying:
Hello hi = new Hello();
Hello.age = 10;
```
### Java Access Modifiers(public, private, protected,etc.):
Here is the summary of access levels :
**public:** (class:yes, package:yes, subclass:yes, world:yes)
**protected:** (class:yes, package:yes, subclass:yes, world:no)
**no modifier:** (class:yes, package:yes, subclass:no, world:no)
**private:** (class:yes, package:no, subclass:no, world:no)
|Modifier| Class | Package| subClass | World	
|--|--| -- | -- | -- |
| Public|	Y |	Y| Y	|	Y		
|Protected	Y	| 	Y	|	 Y |	Y	| N
|no modifier | Y |	Y	| N | N 
| Private | Y	| N	| 	N	 | N

A good practice for variables which are being used only inside the class, to be private or protected.

### Final keyword in Java:
Example: 
> public final  int exmp;

The keyword Final can be used for class, method, or variables. for each one of them it means differently.
| Item	 |Meaning  |
|--|--|
| Class | A final class cannot be subclassed  |
| Method| A final method cannot be overwritten by a subclass
| Variable | A variable can only be initialized once


### Class Inheritance in Java:
We can extend a class in Java, by creating new classes that inherit the characteristics from the parent class. 
For example, if we want to calculate the area of different basic shapes like triangle, rectangle, etc. we can first create a parent class called polygons, because both triangles and rectangles are polygons and the same properties can be pulled into them from the polygon class, like height and width.
I made three classes named Polygon, Rectangle, and Triangle. 
Inside Polygon class we declared two variables width and height, and by defining a set_values method we set the values of a and b by user to be the height and width. like this:
```
public class Polygon {
	protected int height;
	protected int width;
	
	public void set_values(int a, int b) {
		height = a;
		width = b;
	}
}
```
Now we want the rectangle class to inherit from Polygon we just need to say:
```
public class Retangle extends Polygon{

}
```
sometimes we call Polygon the **Base** or **Derived** class , and the Rectangle class, **Deriving** class.
Once we inherit a class to another, all protected and public properties are accessible in the deriving class.
Inside triangle and rectangle classes, we add methods to calculate and return the area.
Now, under MyClass, we can instantiate the classes and return the areas saying:
```
Retangle rec = new Retangle();
    	Triangle tri = new Triangle();
    	
    	rec.set_values(10,10);
    	tri.set_values(10,10);
    	
    	System.out.println(rec.area());
    	System.out.println(tri.area());
```
### Polymorphism in Java:
It means the concept of an object being able to act in different forms. 
Example:
In the workspace, we create four classes. Bank has the interest rate of zero, Bank_ABC has the rate of 5, Bank_DEF has the rate of 6, and Bank_XYZ has 10, and all of the last three inherit from Bank class.
```
public class Bank_ABC extends Bank {
	int getInterestRate() {
		return 5;
	}
}
```

Now, when we want to instantiate a new Bank class, it can be in the form of Bank_ABC. like this:
```
Bank abc = new Bank_ABC();
```
This is called Polyorphism. But remember, then Bank has to be inherited inside Bank_ABC class.
Now we can access getInterestRate() method of each class like this:
```
    	Bank abc = new Bank_ABC();
    	Bank def = new Bank_DEF();
    	Bank xyz = new Bank_XYZ();
    	
    	System.out.println(abc.getInterestRate());
    	System.out.println(def.getInterestRate());
    	System.out.println(xyz.getInterestRate());
output: 5,6,10
```
### Method Overriding:
In the example of the Banks super class, and sub-classes of Bank_ABC, etc. if the sub-classes just extend the super-class Bank, anytime we create an instance of Bank_ABC() using the reference of Bank class, it inherits the properties of the Bank class.

Now, we can override the properties on Bank_ABC class, and when we create the instance, it will inherit from Bank_ABC. For example, Bank class returned interest rate of 0. we can override it defining the interest rate of 5 in Bank_ABC, and it will return 5.

**Rules of Overriding:** 
- you must have same amount of arguments.
- same method name.
- same return datatype.

### Method Overloading:
Overloading happens when we have two methods in one class, with 
**the same name**, then second one can overload on the first one, and it can have different variables and datatypes. like this:
```
public class Bank_ABC {
	int getInterestRate() {
		return 0;
	}
	int gerInterestRate(int adf) {
		return adf * 2;
	}
}
```
### Abstract Methods and Classes:
An abstract class, is a class which cannot be instantiated. For example, in the example of Banks, we can make Bank class, as an abstract class because it does have the general info and functionality, but the sub classes can be instantiated, and inherit from Banks.

In order to make the Bank class abstract we just say:
```
abstract public class Bank {

}
```
as soon as we add the words abstract nobody can instantiate it like this:
```
Bank sample = new Bank();
>this fails
```
In order to make methods abstract there are two conditions:

1- The class in which the method belong to, has to be abstract.
when we define the abstract method in the super class, we don't need to write the implementation of the method. we just say:
```
abstract public class Bank {
	abtract int getInterestRate();
}
```
But when we make sub classes inheriting from Bank super class, we will have to define getInterestRate() definition.

### Interfaces in JAVA:
An interface is the same as an abstract class. They both cannot be instantiated. Instead of saying:
```
abstract public class Bank {
	abstract int getInterestRate()
}
```
we can say:
```
public interface Bank {
	int getInterestRate();
}
```
when we define the interface, all the methods inside it will be abstract by nature.

Also, when we want to define sub classes, we cannot extend the interface. Instead, we implement it. like this:
```
public class Bank_ABC implements Bank {
   int getInterestRate() {
		return 0;
	} 
}
```
Because we defined Bank as interface, the method getInterestRate inside it is abstract, so we need to define it under Bank_ABC class.

- If we want to inherit interface inside another interface, then we again use extends keyword.




