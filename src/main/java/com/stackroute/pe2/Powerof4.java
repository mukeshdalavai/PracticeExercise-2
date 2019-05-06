package com.stackroute.pe2;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Powerof4 {
    public boolean powercheck(int n){
        if((int)(Math.ceil((Math.log(n) / Math.log(4)))) == (int)(Math.floor((Math.log(n) / Math.log(4)))))
            return true;
        else
            return false;
    }
}
