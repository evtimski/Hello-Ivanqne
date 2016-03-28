package com.company;

import java.util.Scanner;

public class _02SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String print = word;
            for (int j = i + 1; j < words.length; j++) {
                String nextWord = words[j];
                i = j - 1 ;
                if (word.compareTo(nextWord) == 0) {
                    print = print + " " + nextWord;
                } else {
                    //print = word;
                    break;
                }
            }
            System.out.println(print);
            if ((i + 1) == (words.length - 1)){
                break;
            }
        }
    }
}
