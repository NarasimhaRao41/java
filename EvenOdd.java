//java program to check whether the given number is Even or odd 
//06-10-2023
//EvenOdd.java
import java.io.*;
import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number to check whether it is prime or not : ");
    int n = sc.nextInt();
    if(n%2==0)
    {
        System.out.println(+n+ "    is even    ");
    }
    else{
        System.out.println(+n+ "    is odd    ");
    }
  
    }
}
