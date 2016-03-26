package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04Copy_jpgFile {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("src/com/company/lili.jpg");
                FileOutputStream fos = new FileOutputStream("src/com/company/my-copied-picture.jpg")){
            int i = 0;
            while ((i=fis.read())!=-1){
                fos.write(i);
            }
        }catch (IOException ioe){
            System.out.println(ioe.toString());
        }

    }
}
