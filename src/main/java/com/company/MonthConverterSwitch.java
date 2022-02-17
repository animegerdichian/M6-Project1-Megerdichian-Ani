package com.company;
import java.util.Scanner;
/* MonthConverterSwitch (using switch logic):
/*1. prompts the user to enter a number between 1 and 12.
/*2. prints out the name of the month corresponding to
/*   the user-entered number.
/*3. prints out error message if the user enters a number
/*   less than 1 or greater than 12
 */
public class MonthConverterSwitch {

    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Please enter a number between 1 and 12: ");
        // Parse user input for an integer
        int monthNumber = Integer.parseInt(scanner.nextLine());

        // Switch statement of months of the year
        // default is for invalid input
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }

    }
}
