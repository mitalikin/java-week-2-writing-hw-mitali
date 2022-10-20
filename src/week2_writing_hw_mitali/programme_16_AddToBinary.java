package week2_writing_hw_mitali;

import java.util.Scanner;

public class programme_16_AddToBinary {
    public static void main(String[] args) {
        System.out.println("welcome to java programme to add two binary number");
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first binary number ");
        String first = sc.nextLine();
        System.out.println("please enter second binary number ");
        String second = sc.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary numbers is :" + addition);
        //closing the scanner object
        sc.close();
    }

    //adding the two binary numbers
    public static String addTwoBinaryNumbers(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);

    }

}



