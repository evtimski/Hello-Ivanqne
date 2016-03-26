package com.company;

import java.io.*;

public class _02ALL_CAPITALS {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/lines1.txt"))) {
            //BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/company/lines1.txt"))) {

            String s;
            String newS = "";
            while ((s = br.readLine()) != null) {
                //System.out.println(s.toUpperCase());
                newS += s.toUpperCase() + "\r\n";
            }

            PrintWriter prw = new PrintWriter(new FileWriter("src/com/company/lines1.txt"));
            prw.print(newS);

            br.close();
            prw.close();

        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}

