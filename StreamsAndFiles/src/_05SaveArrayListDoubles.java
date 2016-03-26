package com.company;

import java.io.*;
import java.util.ArrayList;

public class _05SaveArrayListDoubles {

    private static ArrayList<Double> listDoubels;

    public static void main(String[] args) {

        listDoubels = new ArrayList<Double>();

        listDoubels.add(345.3466);
        listDoubels.add(455676.332452);
        listDoubels.add(3534.12434);
        listDoubels.add(7889.1123);

        saveList();
        loadList();
    }

    private static void saveList(){

        try(ObjectOutputStream ooi = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/com/company/doubles.list")))){
            ooi.writeObject(listDoubels);

        }catch (IOException ioe){
            System.out.println( ioe.toString());
        }
    }

    private static void loadList(){

        try(ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("src/com/company/doubles.list")))){

            //listDoubels = new ArrayList<Double>();
            System.out.println(ois.readObject());

        }catch (ClassNotFoundException | IOException ioe){
            System.out.println(ioe.toString());
        }

    }
}
