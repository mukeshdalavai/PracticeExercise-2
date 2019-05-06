package com.stackroute.pe2;

import java.util.Scanner;

public class StudentGrades {
    int marks[]=new int[20];
    int count;
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        count=sc.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter the marks of  Student "+(i+1)+" : ");
            marks[i]=sc.nextInt();
        }

    }
    public void computeMin(){
        int min=marks[0],minStudent=0;
        for(int i=0;i<count;i++){
            if(marks[i]<min) {
                min = marks[i];
                minStudent = i;
            }
        }
        System.out.println("Student "+minStudent+" got the minimum marks: "+min);
    }
    public void computeMax(){
        int max=0,maxStudent=0;
        for(int i=0;i<count;i++){
            if(marks[i]>max) {
                max = marks[i];
                maxStudent = i;
            }
        }
        System.out.println("Student "+maxStudent+" got the maximum marks: "+max);
    }
    public void computeAvg(){
        int sum=0;
        double avg;
        for(int i=0;i<count;i++){
            sum=sum+marks[i];
        }
        avg=(double)sum/(double)count;
        System.out.println("Average of the marks is: "+avg);
    }
    public static void main(String[] args){
        StudentGrades studentGrades=new StudentGrades();
        studentGrades.getData();
        studentGrades.computeMin();
        studentGrades.computeMax();
        studentGrades.computeAvg();
    }
}
