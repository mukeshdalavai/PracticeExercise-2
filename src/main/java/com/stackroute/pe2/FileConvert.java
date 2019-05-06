package com.stackroute.pe2;
import java.io.*;
import java.util.*;

public class FileConvert {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/mukesh/Downloads/Java coding standard");
        Scanner sc=new Scanner(file);
        System.out.println("The length of the file is: "+file.length());
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String upperCase=s.toUpperCase();
            System.out.println(upperCase);
        }
    }
}
