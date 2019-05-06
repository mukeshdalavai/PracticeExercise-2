package com.stackroute.pe2;
import java.io.*;
import java.util.*;
import java.lang.*;

public class PalindromeRev {
    char c;
    String rev="";
    public boolean palcheck(String s){
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            rev=rev+c;
        }
        if(s.equals(rev))
            return true;
        else
            return false;
    }
}
