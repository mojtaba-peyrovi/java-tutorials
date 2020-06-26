package lesson1;

public class Classes {
	public static void main(String[] args) {
		Students mark = new Students();
		
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(15);
		System.out.println(mark.getName() +" " + mark.getAge());
	}
}
