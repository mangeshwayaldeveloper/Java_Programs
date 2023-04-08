import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ClassLoaderEx {
    public static void main(String[] args) {
     Class c=ClassLoaderEx.class;
Scanner sc=new Scanner(System.in);
//        System.out.println(c.getClassLoader());
        System.out.println("This is the string classloader= "+String.class.getClassLoader());
        System.out.println("This is the system classloader= "+System.class.getClassLoader());
        System.out.println("this is the scanner classloader= "+ Scanner.class.getClassLoader());
        // system classloader
        System.out.println("This is the classloader of mangesh class= "+mangesh.class.getClassLoader());

    }
}
class mangesh{
Class c=mangesh.class;

        }
