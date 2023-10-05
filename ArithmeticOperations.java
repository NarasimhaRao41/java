//Java program to perform arithmetic operations between two numbers 
//05/10/2023
//ArithmeticOperations.java

import java.io.*;
import java.util.Scanner;
public class ArithmeticOperations{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B value : ");
        int b = sc.nextInt();
        System.out.println("------------------------------------------------");
        System.out.println("The Addition of  "+a+ " and " +b+ " is  " +(a+b));
        System.out.println("------------------------------------------------");
        System.out.println("The Difference of "+a+" and " +b+ " is  " +(a-b));
        System.out.println("------------------------------------------------");
        System.out.println("The Product of "+a+" and " +b+ " is  " +(a*b));
        System.out.println("------------------------------------------------");
        System.out.println("The Quotient of "+a+" and "+b+ "is   " +(a/b));
        System.out.println("------------------------------------------------");
        System.out.println("The Remainder of "+a+ "and "+b+ "is  " +(a%b));
        System.out.println("------------------------------------------------");
    }
}
