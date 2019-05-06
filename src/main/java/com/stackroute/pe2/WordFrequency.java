package com.stackroute.pe2;
import java.io.*;
import java.util.*;

public class WordFrequency {
    public void getWords() throws FileNotFoundException {
        String[] lines=new String[500];
        int i=0,c=0,noWord=0;
        int[] wordcount=new int[500];
        String[] wordlist=new String[1000];
        File file = new File("/home/mukesh/Downloads/avengers");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()) {
            lines[i] = sc.nextLine();
            String[] words = lines[i].split("\\s");
            for (String word : words) {
                noWord=0;
                for (int j = 0; j <=c; j++) {
                    if (word.equals(wordlist[j])){
                        wordcount[j]++;
                        noWord++;
                    }
                }
                    if (noWord==0) {
                        wordlist[c] = word;
                        c++;
                }
            }
            i++;
        }
        for(int k=0;k<=c;k++)
        System.out.println("Word: "+wordlist[k]+"   Frequency: "+(wordcount[k]+1));
        System.out.println(c);
    }
    public static void main(String[] args) throws FileNotFoundException{
        WordFrequency wordFrequency=new WordFrequency();
        wordFrequency.getWords();
    }
}