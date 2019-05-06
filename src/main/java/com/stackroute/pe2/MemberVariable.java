package com.stackroute.pe2;

public class MemberVariable {
    Member m;

    public MemberVariable() {
        m = new Member();

        m.name = "Mukesh";
        m.age = 22;
        m.salary = 400000;
    }
    void display(){
        System.out.println(m.name+"\n"+m.age+"\n"+m.salary);
    }
    public static void main(String[] args){
        MemberVariable mv=new MemberVariable();
        mv.display();
    }
}