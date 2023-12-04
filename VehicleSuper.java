import java.io.*;
import java.util.*;
class Vehicle{
    Scanner s = new Scanner(System.in);
    String name;
    int year;
    void Vehicle(){
        System.out.println("Enter the car name: ");
        name = s.nextLine();
        System.out.println("Enter the car year: ");
        year = s.nextInt();
    }
    void EngineInfo(){
        System.out.println("Starting the car engine : ");
        System.out.println("Engine started ");
        System.out.println(" car engine started ");
    }
}
class Car extends Vehicle{
    void carDetails(){
        System.out.println("Displaying Car Information : ");
        System.out.println("Name: "+super.name);
        System.out.println("Year : "+super.year);
    }
    void EngineInfo(){
        super.EngineInfo();
    }
}
class Main{
    public static void main(String[] args){
        Car c = new Car();
        c.Vehicle();
        c.carDetails();
        c.EngineInfo();
    }
}
