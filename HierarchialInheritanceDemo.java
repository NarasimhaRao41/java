// java program to demonstrate Hierarchial Inheritance
//29/09/2023
//HierarchialInheritanceDemo.java
import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat ");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog can Bark");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat Sounds Meow ");
    }
}
public class HierarchialInheritanceDemo{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.bark();
        c.meow();
        d.eat();
    }
}
