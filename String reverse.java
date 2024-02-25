import java.util.*;
import java.lang.*;
class StringReverse {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st = str.nextLine();
        System.out.println("The String is \n"+st);
        StringBuffer sbr = new StringBuffer(st);
        sbr.reverse();
        System.out.println(sbr);
    }
}