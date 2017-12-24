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

        printArray(myArray);

        printArray(sortIntegers(myArray));


    }

    public static int[] getIntegers(){

        // getIntegers returns an array of entered integers from keyboard

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10:\r");

        int size = scanner.nextInt();

        System.out.println("Enter " + size + " numbers:\r");
        int[] numArr = new int[size];

        int len = numArr.length;

        for (int i = 0; i < len; i++){
            numArr[i] = scanner.nextInt();
        }

        return numArr;
    }

    public static void printArray(int[] arr){

        // printArray prints out the contents of the array

        int len = arr.length;

        for ( int i = 0; i < len; ++i){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortIntegers(int[] arr){

        // sortIntegers should sort the array in descending order
        // and return a new array containing the sorted numbers

        // bubble sort

        int len = arr.length;

        for (int i = 0; i < len; i++){
            for (int j = 0; j < len - i - 1; j++){
                if (arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nNow I am going to print them sorted in descending order (from high to low)...");

        return arr;
    }

}
