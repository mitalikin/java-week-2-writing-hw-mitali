package week2_writing_hw_mitali;

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter uppercase string: ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase sc = new Programme_9_ConvertUpperToLowerCase();
        sc.ConvertUppercaseToLowercase(uppercase);
        //closing the scanner
        scanner.close();

    }

    //Conversion of uppercase to lower case method
    public void ConvertUppercaseToLowercase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
