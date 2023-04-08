import java.rmi.server.ExportException;

public class ExceptoionHandlling {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[4]=100;
            a[5]=50;
            int data=100/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Bound");
        }
        try{
            int data=100/0;
        }catch (ArithmeticException e){
            System.out.println("Can't Divide By 0");

        }
    }
}
