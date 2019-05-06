package com.stackroute.pe2;

public class PrintFactorials {
    public void printIntFactorials(){
        int fac=1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                fac=fac*i;
            }
            System.out.println("Factorial of "+i+" is: "+fac);
            fac=1;
        }
        System.out.println("Factorial of 10 is out of range");
    }
    public void printLongFactorials(){
        long fac=1,i=1;
        while(i<=15){
            fac=1;
            for(int j=1;j<=i;j++){
                fac=fac*i;
            }
            System.out.println("Factorial of "+i+" is: "+fac);
            i++;
        }
        System.out.println("Factorial of 16 is out of range");
    }
    public static void main(String[] args){
        PrintFactorials printFactorials=new PrintFactorials();
        printFactorials.printIntFactorials();
        printFactorials.printLongFactorials();
    }

}
