package Exception;

import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class BuiltInException {
    public static void main(String[] args) {
        //Arithmetic Exception
        int a = 10;
        int b = 0;
        try {

            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
        //Array Index Out Of Bound Exception
        int[] arr = {4, 2, 4, 2, 42, 2, 36, 8};
        try {

            System.out.println(arr[-1]);
        } catch (Exception e) {
            System.out.println(e);
        }
        //Class Not Found Exception-accessing the class whose definition is not found
        //checked Exception
        try {
            Class.forName("Class1");
        } catch (Exception e) {
            System.out.println(e);
        }
        //File Not Found Exception
        //checked Exception
        try {
            File n = new File("C://User//mange//Interview.txt");
            FileReader fr = new FileReader(n);

        } catch (Exception e) {
            System.out.println(e);
        }
        //IO Exception-occurred when input output operation is failed or interrupted
        Scanner scan = new Scanner("Hello Mangesh");
        System.out.println(" " + scan.nextLine());
        System.out.println("Exception Output: " + scan.ioException());
        scan.close();

        //Null Pointer Exception
        try {
            String st = null;
            System.out.println(st.charAt(0));
        } catch (Exception e) {
            System.out.println(e);
        }
        //String Index Out Of Bound Exception
        try{
            String s="This is like chipping";
            char c=s.charAt(24);
        }catch (Exception e){
            System.out.println(e);
        }
// Number Format Exception
        try{
            int num=Integer.parseInt("mangesh");
            System.out.println(num);
        }catch (Exception e){
            System.out.println(e);
        }
        // NO Such Method Exception
        try{
            Set set=new HashSet();
            Hashtable hashtable=new Hashtable();
            set.iterator().next();
            hashtable.elements().nextElement();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
