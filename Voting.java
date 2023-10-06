//java program to check whether the given person is eligible for vote or not 
//06-10-2023
//Voting.java
import java.io.*;
import java.util.Scanner;
public class Voting{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age of the person : ");
    float n = sc.nextFloat();
    if(n>=18)
    {
        System.out.println("Person is eligible for voting......");
    }
    else
    {
        System.out.println("Person is not eligible for voting....");
    }
    }
}
