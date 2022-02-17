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

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Please enter a number between 1 and 12: ");
        // Parse user input for an integer
        int monthNumber = Integer.parseInt(scanner.nextLine());

        // Initialize variable for output message
        String outputMessage = "";

        // Assign the correct output message
        if(monthNumber == 1){
            outputMessage = "January";
        }
        else if(monthNumber == 2){
            outputMessage = "February";
        }
        else if(monthNumber == 3){
            outputMessage = "March";
        }
        else if(monthNumber == 4){
            outputMessage = "April";
        }
        else if(monthNumber == 5){
            outputMessage = "May";
        }
        else if(monthNumber == 6){
            outputMessage = "June";
        }
        else if(monthNumber == 7){
            outputMessage = "July";
        }
        else if(monthNumber == 8){
            outputMessage = "August";
        }
        else if(monthNumber == 9){
            outputMessage = "September";
        }
        else if(monthNumber == 10){
            outputMessage = "October";
        }
        else if(monthNumber == 11){
            outputMessage = "November";
        }
        else if(monthNumber == 12){
            outputMessage = "December";
        }
        else{
            outputMessage = "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.";
        }
        // Print output
        System.out.println(outputMessage);
    }
}
