/**
 * @class: Cylinder
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 3, 2023
 * @description: In this script I will be writing a program that calculates the base area and volume of a cylinder,
  given the radius of the base circle and the length of the cylinder.
 */
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // In this line you will be inputting the radius of the cylinder
        System.out.print("Enter the radius of the cylinder base: ");
        double radius = input.nextDouble();
        // In this line you will be inputting the length of the cylinder
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        // This here is the equation for area of the base
        double baseArea = 3.1416 * radius * radius;
        // This line is the equation for volume
        double volume = baseArea * length;

        System.out.println("The base area of the cylinder is: " + baseArea);
        System.out.println("The volume of the cylinder is: " + volume);

    }
}
