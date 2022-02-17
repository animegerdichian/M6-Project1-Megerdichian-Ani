package com.company;

/*ArrayFunReverseIt:
/*1. your code must declare the array [1,2,3,4,5]
/*2. create another array of equal length
/*3. fill that array with values from the
     original array but in reverse order
 */
public class ArrayFunReverseIt {

    public static void main(String[] args) {

        // initialize arrays
        int arrSize = 5;
        int[] originalArr = {1,2,3,4,5};
        int[] reversedArr = new int[arrSize];

        // initialize variable to keep track of indices
        // starting at the end of the originalArr
        int j = originalArr.length - 1;

        for(int i=0; i < reversedArr.length; i++){
            // assign value to reversedArr at index i
            reversedArr[i] = originalArr[j];
            j--; // decrement j to move to the next index to the left
        }

        System.out.print("Original Array: ");
        for(int num : originalArr){
            System.out.print(num + " ");
        }
        System.out.print("\nReversed Array: ");
        for(int num : reversedArr){
            System.out.print(num + " ");
        }

    }
}
