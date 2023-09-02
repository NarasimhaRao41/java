//Java program to demonstrate Nested-if
//26/08/2023
//NestedIf.java
import java.io.*;
import java.util.*;
public class NestedIf{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Marks of Three Subjects");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total = m1+m2+m3;
float avg = (float)total/3;
if(avg>=75){
if(avg>=95){
System.out.println("Your Average is in top 5%");
}
else if(avg>=90){
System.out.println("Your Average is in top 10%");
}
else{
System.out.println("Student passed in Distinction !");
}
}
else if(avg>=40 && avg<75){
System.out.println("Student Passed !");
}
else{
System.out.println("Student Failed !");
}
}
}
