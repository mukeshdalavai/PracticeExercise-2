package com.stackroute.pe2;
import java.io.*;
import java.util.*;

public class FileSelect {
    public void readFile(String givenFileName) throws FileNotFoundException {
        int c=0;
        byte[] data=new byte[200];
        File directory = new File("/home/mukesh/Downloads");
        File[] files=directory.listFiles();
        System.out.println("The list of available files are: "+givenFileName);
        for(int i=0;i<files.length;i++) {
            System.out.println(files[i].getName());
            if((files[i].getName()).equals(givenFileName)) {
                c = i;
            }
        }
        System.out.println("Selected file for input is: "+files[c].getName());
        Scanner sc=new Scanner(files[c]);
        int i=0;
        while(sc.hasNextByte()){
            data[i]=sc.nextByte();
            System.out.println(data[i]+"jj");
            i++;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileSelect fileSelect=new FileSelect();
        fileSelect.readFile("Java coding standard");
    }
}
