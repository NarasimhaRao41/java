// Java program to demonstrate usage of super keyword  with variables
//05/10/2023
//SuperVariableDemo.java

import java.io.*;
class Animal{
    protected String type = "Domestic";
}
class Dog extends Animal{
    public String type = "Mammal";
    public void PrintType(){
        System.out.println("Iam "+type);
        System.out.println("Iam "+super.type);
    }
}
public class SuperVariableDemo{
    public static void main(String[] args){
        Dog d = new Dog();
        d.PrintType();
    }
}
