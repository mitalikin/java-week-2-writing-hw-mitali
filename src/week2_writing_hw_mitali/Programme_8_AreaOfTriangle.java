package week2_writing_hw_mitali;

import java.util.Scanner;

/**
 * write a programme to calculate the are if triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Please enter the length of the triangle: ");
        int length = scanner.nextInt();
        System.out.println("please enter the height of the triangle: ");
        int height = scanner.nextInt();
        areaOfTriangle(length, height);
        scanner.close();


    }

    public static void areaOfTriangle(int lenght, int height) {
        int area = (lenght * height) / 2;
        System.out.println("The Area of a triangle is : " + area);
    }
}
