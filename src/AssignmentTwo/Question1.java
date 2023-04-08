package AssignmentTwo;

import javax.swing.plaf.TableHeaderUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        try {
            arr[0] = 2;
            arr[1] = 4;
            arr[2] = 6;
            arr[3] = 8;
            arr[4] = 6;
            arr[5] = 8;
            // array index out of bound exception handled
        } catch (Exception e) {
            System.out.println("first exception is " + e);
        }

        // arithmetic exception
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Second Exception " + e);
        }

        // input mismatch exception
        System.out.println("Enter Any Value ex-String, Char");
        try {
            int a = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Third Exception " + e);
        }
        //Null Pointer Exception
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Fourth Exception " + e);
        }
        //fifth exception thread time value is negative
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //try to make the thread sleep for -10 millisecond
                        Thread.sleep(-10);
                    } catch (Exception e) {
                        System.out.println("Fifth Exception " + e);
                    }
                }
            });
            thread.setName("Test Thread");
            thread.start();
    }
}
