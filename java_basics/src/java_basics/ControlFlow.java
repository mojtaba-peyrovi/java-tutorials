package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hungry = false;
		
		if(hungry) {
			System.out.println("I'm starving!");
		} else {
			System.out.println("I'm not hungry!"); 
		}
		
		int hungerRate = 5;
		if (!(hungerRate<6)) {
			System.out.println("not hungry!");
		}else {
			System.out.println("I'm starving!");
		}
		
		int favoriteTemp = 75;
		int currentTemp = 60;
		String opinion;
		
		if (currentTemp < favoriteTemp - 30) {
			opinion = "it's pretty darn cold!";
		} else if (currentTemp < favoriteTemp - 20) {
			opinion = "it's kinda cold out!";
		} else if (currentTemp > favoriteTemp + 10) {
			opinion = "it's hot out!";
		}else {
			opinion = "it's a beautiful day!";
		}
		
		System.out.println(opinion);
		
		int month = 2	;
		String monthString;
		
		switch (month) {
		case 1: monthString = "January";			
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknow month";
			break;
		}
		
		System.out.println(monthString);
	}

}
