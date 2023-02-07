/**
 * @class: RoomDimensions
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 3, 2023
 * @description: Given the length, width and height of the room, number of windows and number doors, This program will
  calculate the gallons and quarts of paint needed to paint the room.
 */

import java.util.Scanner;
public class RoomDimensions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // When prompted you will input the length of the room
        System.out.print("Enter the length of the room: ");
        double length = sc.nextDouble();
        // When prompted you will input the width of the room
        System.out.print("Enter the width of the room: ");
        double width = sc.nextDouble();
        // When prompted you will input the height of the room
        System.out.print("Enter the height of the room: ");
        double height = sc.nextDouble();
        // When prompted you will input the amount of windows in the room
        System.out.print("Enter the windows of the room: ");
        int windows = sc.nextInt();
        // When prompted you will input the amount of doors in the room
        System.out.print("Enter the doors of the room: ");
        int doors = sc.nextInt();
// This is the equation to find the area of the wall
        double wallArea = 2 * (length * height + width * height);
// This is the equation to find the area of the windows
        double windowArea = windows * 15;
// This is the equation to find the area of the door
        double doorArea = doors * 21;
// This is the equation to find the area of the total amount that is printable
        double totalPrintableArea = wallArea - windowArea - doorArea;
// This is the equation to find the amount of gallons of paint needed
        double gallonsNeeded = totalPrintableArea / 350.0;
        int wholeGallons = (int) gallonsNeeded;
// This equation is to find the amount of quarts need for the room
        double quartsNeeded = (gallonsNeeded - wholeGallons) * 4;
// This will be the new output
        System.out.println("You need " + wholeGallons + " gallons and " + quartsNeeded + " quarts of paint.");

    }
}
