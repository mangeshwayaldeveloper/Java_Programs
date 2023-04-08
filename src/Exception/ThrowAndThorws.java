package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowAndThorws {

   public static void useOfthrow() {
        throw new InputMismatchException();
    }

    public static void main(String[] args) {
        try {

            useOfthrow();

        } catch (Exception e) {
//            System.out.println(e);
            System.out.println("Dont Use number for name");
        }
        System.out.println("Hello my name is rohan");
    }

}
// throw-
