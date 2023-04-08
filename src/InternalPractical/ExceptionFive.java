package InternalPractical;

import JavaMahaParactise.CharAT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFive extends Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            // input mismatch
            System.out.println("Enter Input");
            int i = s.nextInt();
            System.out.println("i");

            int a = 122;
            int b = 0;
            int c = a / b;

            int arr[] = {23, 3, 5, 34};


            System.out.println(arr[6]);
            System.out.println(c);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e);
        }
        //null pointer exception
        try {
            String st = null;
            System.out.println(st.length());
        } catch (Exception e) {
            System.out.println(e);
        }//////////////////////////////////
        try {
            String n = "This is beautifull day but i can't see it ";
            System.out.println(n.charAt(90));
        }catch (Exception e){
            System.out.println(e);
        }/////////////////
        try{
            String st=s.nextLine();
            int n=Integer.parseInt(st);
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
