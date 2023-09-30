// java program to demonstrate multi-level Inheritance
//29/09/2023
//MultiLevelInheritanceDemo.java
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
class BabyDog extends Dog{
    void weep(){
        System.out.println("BabyDog can Weep ");
    }
}
public class MultiLevelInheritanceDemo{
    public static void main(String[] args){
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
