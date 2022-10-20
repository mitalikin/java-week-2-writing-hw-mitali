package week2_writing_hw_mitali;

import java.util.Scanner;

/**
 * Write a Java programme to print the area and perimeter of a rectangle.
 * Test data:
 * Width = 5.5 Height = 8.5
 * Expected output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2*(5.6 + 8.5)=28.20
 */
public class programme_14_AreaAndPerimeter {
    //calculating area and perimeter of rectangle
    public static void areAreaAndPerimeterOfRectangle(int height, int width) {
        int perimeter = 2 * (height * width);
        int area = (height * width);
        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The perimeter of the rectanle is : " + perimeter);
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from consol
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int height = sc.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int width = sc.nextInt();
        areAreaAndPerimeterOfRectangle(height, width);
        //closing the scanner object
        sc.close();
    }
}
