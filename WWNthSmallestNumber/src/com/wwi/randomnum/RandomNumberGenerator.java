package com.wwi.randomnum;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {

        Random random = new Random();
        int counter;
        int[] numbers = new int[ 500 ]; // size should reflect that.
        numbers[0] = random.nextInt(1000); // Init First number
        int largest = numbers[0]; //Set it as largest
        int smallest = numbers[0]; // Set it as smallest
        for (counter = 1 ; counter <  500; counter++)
        {
            numbers[counter] = random.nextInt(1000); //Store numbers;
            System.out.println("Random number " +counter+ ": "+numbers[counter]);
            largest = Math.max( largest , numbers[counter ] ); //Compare with previous largest
            smallest = Math.min( smallest , numbers[counter ] );  //Compare with previous smallest

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int nthSmallest = sc.nextInt();

        System.out.println("Nth smallest Random Number for N = "+nthSmallest+" is : "+ findNthSmallest(numbers, nthSmallest));

    }
    private static int findNthSmallest(int[] array, int n) {
        Arrays.sort(array);
        return array[n-1];
    }
}
