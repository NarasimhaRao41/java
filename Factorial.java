//Java Program to find the Factorial of a given number
//26/08/2023
//Factorial.java
import java.io.*;
import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Positive integer number :");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of  " +n+ "  is  " +fact);
    }
}
