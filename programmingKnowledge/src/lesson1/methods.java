package lesson1;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFirstMethod();
		greetings("John");
		add(12,13);
		int sum = addition(12,34);
		System.out.println(sum);
	}
	
	public static void myFirstMethod() {
		System.out.println("this is from a method");
	}
	
	public static void greetings(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int addition(int a, int b) {
		return (a+b);
	}
	
}
