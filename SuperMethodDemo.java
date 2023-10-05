// Java program to demonstrate usage of super keyword
//05/10/2023
//sauperMethodDemo2.java

import java.io.*;
class Animal{
    public void display(){
        System.out.println("Animal(PARENT CLASS) ");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println("Dog is an animal  ");
    }
    public void PrintMessage(){
        display();
        super.display();
    }
}
public class SuperMethodDemo2{
    public static void main(String[] args){
        Dog d = new Dog();
        d.PrintMessage();
    }
}
