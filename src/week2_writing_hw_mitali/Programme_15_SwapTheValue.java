package week2_writing_hw_mitali;

import java.util.Scanner;

/**
 * write a Java programme to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first variable value: ");
        int first = sc.nextInt();
        System.out.println("Enter the second variable value: ");
        int second = sc.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first, second);
        //closing the scanner object
        sc.close();
    }

    //swapping the value of variable
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping. The value of first variable is : " + a + " and second variable is :" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping. The value of first variable is : " + a + " and second variable is :" + b);
    }
}
