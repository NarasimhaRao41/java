/Java program for examples of Wrapperclass in java , CmdLineArguments, if-else, Obj-Class, Arth Op, Str len, Simple or SingleLine Inheritance
//02/09/2023
//CmdLineArgsV3.java
import java.io.*;
public class CmdLineArgsV3 extends Object{
    public static void main(String[] args) {
        CmdLineArgsV3 obj = new CmdLineArgsV3();
        if(args.length!=2)
        {
            System.out.println("Invalid no.of.args \nYou need to pass only two Integers");
        }
        else{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;
        System.out.println("The class name is --> " +obj.getClass());
        System.out.println(" Sum of " +x+  " and "   +y+   " is "   +z);
        }
    }
}
