package week2_writing_hw_mitali;

import java.util.Scanner;

/**
 * Write a programme to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius((F-32)*5/9=)0 degree c)
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input from consol
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        float temp = sc.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.ConvertToDegreeCelsius(temp);
        //closing the scanner object
        sc.close();
    }

    //Temperature conversion method
    public void ConvertToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is eual to " + c + "degree");
    }

}
