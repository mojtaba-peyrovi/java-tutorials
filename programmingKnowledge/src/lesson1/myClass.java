package lesson1;

import java.util.Scanner;

public class myClass {
    public static void main(String[] args) {
//        System.out.println("Hello World");
    /*
        When user inputs AN INTEGER
     */
//          Scanner scan = new Scanner(System.in);
//          System.out.println("Enter Some Number:");
//          int user_input_number = scan.nextInt();
//          System.out.println("The Entered Value is:");
//          System.out.println(user_input_number);
    /*
        When user inputs A DECIMAL
     */
//        Scanner scan_one = new Scanner(System.in);
//        System.out.println("Enter Some Decimal Value:");
//        double user_input_double = scan_one.nextDouble();
//        System.out.println("The Entered Value is:");
//        System.out.println(user_input_double);
     /*
        When user inputs A STRING:
      */
        Scanner scan_two = new Scanner(System.in);
        System.out.println("Enter Some String:");
        String user_input_string = scan_two.nextLine();
        System.out.println("The Entered String is:");
        System.out.println(user_input_string);
    }

}
