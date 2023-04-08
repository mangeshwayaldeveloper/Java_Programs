package Exception;

import java.util.InputMismatchException;

public class throwUse {
    static void th() {
        try {
            throw new InputMismatchException("Mismatch");
        } catch (InputMismatchException e) {
            System.out.println("caught Inside Of fun()");
            throw e;// rethrowing exception
        }
    }
    public static void main(String[] args) {
        try {
            th();
        } catch (InputMismatchException e) {
            System.out.println("This is the Main");
        }
    }
}
