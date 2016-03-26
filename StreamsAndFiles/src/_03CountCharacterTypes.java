package com.company;

import java.io.*;

public class _03CountCharacterTypes {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("src/com/company/words.txt")) {
            // Vowels: 13
            // Consonants: 17
            // Punctuation: 2

            int i = 0;
            int vowels = 0;
            int consonants = 0;
            int punctoation = 0;
            String countToFile;

            while ((i = fr.read()) != -1) {
                //System.out.println((char) i);
                switch (i) {
                    case 97: case 101: case 105: case 111: case 117:
                        vowels++;
                        break;
                    case 33: case 63: case 44: case 46:
                        punctoation++;
                        break;
                    case 32:
                        break;
                    default:
                        consonants++;
                        break;
                }
            }
            countToFile = String.format(" Vowels:%d\n Consonants:%d\n Punctuation:%d\n"
                    , vowels, consonants, punctoation);
            System.out.printf("Vowels:%d\nConsonants:%d\nPunctuation:%d\n", vowels, consonants, punctoation);

            PrintWriter pw = new PrintWriter(new FileWriter("src/com/company/count-chars.txt"));
            pw.write(countToFile);

            pw.close();
            fr.close();

        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}

