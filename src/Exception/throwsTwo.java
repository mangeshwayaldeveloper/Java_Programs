package Exception;

import java.util.InputMismatchException;

public class throwsTwo {
    static void fun()throws InputMismatchException{
        throw new InputMismatchException();
    }
    public static void main(String[] args) {
        try {
            fun();
        }catch (InputMismatchException e){
            System.out.println("This is Handled Exception Of InputMismatch");
        }
    }
}
