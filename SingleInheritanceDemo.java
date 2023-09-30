// java program to demonstrate SingleInheritance concept
//29/09/2023
//SingleInheritanceDemo.java
import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal Can Eat ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Can Bark ");
    }
}
public class SingleInheritanceDemo{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
