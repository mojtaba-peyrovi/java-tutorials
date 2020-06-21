package lesson1;

public class for_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myintarray = {123,45,76,56,34};
//		for (int index=0; index < 5; index++)
//		{
//			System.out.println(myintarray[index]);
//		}
		
		for(int element : myintarray)
		{
			System.out.println(element);
		}
	}

}
