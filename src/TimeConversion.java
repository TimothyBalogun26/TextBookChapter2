/**
 * @class: TimeConversion
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 3, 2023
 * @description: In this script I will write a program that converts a given total number of seconds into hours, minutes and seconds.
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // When prompted with this line you will enter the seconds
        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = input.nextInt();
// This is the equation for hours
        int hours = totalSeconds / 3600;
// This is the equation for seconds to minutes
        int minutes = (totalSeconds % 3600) / 60;
// This is the equation for converting seconds
        int seconds = totalSeconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes and " + seconds + " seconds");


    }
}
