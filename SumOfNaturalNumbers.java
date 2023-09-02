//Java Program to find the sum of n natural numbers
//26/08/2023
//SumOfNaturalNumbers.java
import java.io.*;
import java.util.*;
public class SumOfNaturalNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value in between 1 to 20 :");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first  " +n+ "  Natural numbers is  " +sum);
    }
}
