package lesson1;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring = "This is a String";
		String mystringLowercase = mystring.toLowerCase();
		String mystringUppercase = mystring.toUpperCase();
		System.out.println(mystring.length());
		System.out.println(mystringLowercase);
		System.out.println(mystringUppercase);
		//concatenation
		System.out.println(mystring + "." + mystringLowercase + "." + mystringUppercase);
		System.out.println(mystring.replace("a", "an"));
	}

}
