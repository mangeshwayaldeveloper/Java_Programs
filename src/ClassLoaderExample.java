import java.util.Scanner;

public class ClassLoaderExample {
    public static void main(String[] args) {
        //let's print the classloader name of the current class
        //Application/System classloader will be load this class
        Class c=ClassLoaderExample.class;
        System.out.println(c.getClassLoader());
//        if we see the classloader name of the class string it will print null
//        because it is an in built class which is found in rt.jar (or in library)
//        so it is loaded By Boostrap classloader
        System.out.println("This is the class loader for String  Class="+String.class.getClassLoader());
        System.out.println("This is the class loader for System  Class="+System.class.getClassLoader());
        System.out.println("This is the class loader for Scanner Class="+Scanner.class.getClassLoader());
    }
}
