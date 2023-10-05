// Java program to demonstrate usage of super keyword  with constructors
//05/10/2023
//superConstructorDemo.java

import java.io.*;
class Animal{
    Animal(){
    System.out.println("Im an Animal ");
    }
}
class Dog extends Animal{
    Dog(){
        super();
            System.out.println("Im Dog ");
     }
}
public class SuperConstructorDemo{
    public static void main(String[] args){
        Dog d = new Dog();
    }
}
