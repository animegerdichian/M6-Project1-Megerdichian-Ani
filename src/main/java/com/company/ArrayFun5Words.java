package com.company;
import java.util.Scanner;

/*ArrayFunUser:
/*1. read five words from the user
/*2. put the five words in an array
/*3. print the array elements to the screen
 */
public class ArrayFun5Words {
    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        int inputSize = 5; // total number of queries to the user
        String[] inputArray = new String[inputSize]; // array to store user input

        // Ask user for input and store the input in the inputArray
        for(int i = 0; i < inputSize; i++){
            System.out.print("Please enter a word: ");
            inputArray[i] = scanner.nextLine();
        }

        // Print the array elements
        System.out.println("You entered the words: ");
        for(String word : inputArray){
            System.out.println(word);
        }
    }
}
