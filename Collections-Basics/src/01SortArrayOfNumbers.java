package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _01SortArrayOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrayCount = sc.nextInt();
        Integer[] numbers = new Integer[arrayCount];

        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < arrayCount; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
