package com.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        // with a little inspiration from sorting algos --> https://www.geeksforgeeks.org/sorting-algorithms/

        System.out.println("This is Section 9 - Arrays");

        int[] myArray = getIntegers();

    }

    public static int[] getIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10:\r");

        int size = scanner.nextInt();

        System.out.println("Enter " + size + " numbers:\r");
        int[] numArr = new int[size];

        int len = numArr.length;

        for (int i = 0; i < len; i++){
            numArr[i] = scanner.nextInt();
        }


        for (int i = 0; i < numArr.length; i++){
            System.out.print(numArr[i] + " ");
        }

        return numArr;
    }

}
