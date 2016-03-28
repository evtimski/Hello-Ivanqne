package com.company;

import java.util.Scanner;

public class _03LargestSequenceOfEqualStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s");
        String leftmost = "";
        int mostcount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            //System.out.println(word);
            String print = word;
            int counter = 0;
            for (int j = i + 1; j < words.length; j++) {
                i = j - 1;
                String s = words[j];
                if (word.compareTo(s) == 0) {
                    print = print + " " + s;
                    counter++;
                } else {
                    break;
                }
            }
            if (mostcount < counter) {
                mostcount = counter;
                leftmost = print;
            }
            if (i + 1 == words.length - 1) {
                break;
            }
        }
        System.out.println(leftmost);
    }
}
