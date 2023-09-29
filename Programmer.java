//java program to demonstrate inheritance concept
//Programmer.java
import java.io.*;
class Employee {
    float salary = 40000;
}
class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String[] args){
        Programmer p = new Programmer();
        System.out.println("Salary of the programmer is " +p.salary);
        System.out.println("Bonus of the programmer is " +p.bonus);
        float grosssalary = p.salary+p.bonus;
        System.out.println("Gross Salary of the programmer is " +grosssalary);
    }
}
