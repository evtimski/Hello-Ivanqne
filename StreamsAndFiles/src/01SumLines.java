package com.company;

import java.io.*;

public class _01SumLines {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/lines1.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException fnf) {
            System.out.println(fnf.toString());
        }

        try (FileReader fr = new FileReader("src/com/company/lines1.txt")) {
            int i;
            int sumByRow = 0;

            while ((i = fr.read()) != -1) {
                //System.out.printf("%s : %d\n", (char) i, i);
                if (i == 13) {
                    System.out.println("Sum By Row: " + sumByRow);
                    sumByRow = 0;
                    i = 0;
                }

                if (i != 10) {
                    sumByRow += i;
                }
            }
            System.out.println("Sum By Row: " + sumByRow);

        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
