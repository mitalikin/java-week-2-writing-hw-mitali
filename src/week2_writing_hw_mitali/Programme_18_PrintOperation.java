package week2_writing_hw_mitali;

import java.util.Scanner;

/**
 * Write a java programme to print the sum (addition),multiply,subtract,divide and
 * remainde of two numbers
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected output:
 * 125+24=149
 * 125-24=101
 * 125*24=3000
 * 125/24=5
 * 125%24= 5
 */

public class Programme_18_PrintOperation {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number20");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = sc.nextInt();
        Programme_18_PrintOperation p = new Programme_18_PrintOperation();
        p.printTheOperation(firstNumber, secondNumber);
        //closing the scanner object
        sc.close();
    }

    //printing the all operation
    public void printTheOperation(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The division of " + a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
    }

}
