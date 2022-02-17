package com.company;
import java.util.Scanner;
/* MonthConverterIf (using if statements):
/*1. prompts the user to enter a number between 1 and 12.
/*2. prints out the name of the month corresponding to
/*   the user-entered number.
/*3. prints out error message if the user enters a number
/*   less than 1 or greater than 12
 */

public class MonthConverterIf {


    public static void main(String[] args) {

        // Array of months
        String months [] = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Please enter a number between 1 and 12: ");
        // Parse user input for an integer
        int monthNumber = Integer.parseInt(scanner.nextLine());

        if (monthNumber >=1 && monthNumber <= 12) {
            System.out.println(months[monthNumber-1]);
        }
        else{
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}
