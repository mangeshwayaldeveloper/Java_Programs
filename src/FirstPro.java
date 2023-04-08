import org.w3c.dom.ls.LSOutput;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class FirstPro {
    static int a =10;
    float b=100.2f;
    static double d=124;
    public static void mangesh(){
        int a=19;  //local variable
        System.out.println("Hello Adesh"+a);
    }
    public static void meth(){
        System.out.println(a);
        System.out.println(d);
    }
    public static  void main(String... adesh) {
        int s=10;
        if (s>0){
            int a=56;

            System.out.println(a);
        }
        for (int i=0; i<14;i++){
            System.out.println(i);
        }
//        adesh[0]="hello";
        mangesh();
        meth();
        System.out.println(s);
//        Scanner sc=new Scanner(System.in);
        Class c=ClassLoaderExample.class;
//        System.out.println(c.getClassLoader());
//       System.out.println("This is the class loader for String  Class="+String.class.getClassLoader());
//        adesh[1]="welcome";
//        System.out.println(adesh);
//        System.out.println(adesh[1]);

    }
}
