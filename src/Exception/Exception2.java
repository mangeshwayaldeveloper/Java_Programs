package Exception;

class myExcep extends Exception {
    public myExcep(String s) {
        super(s);
        System.out.println("This Contains a message");
    }
}

public class Exception2 {

    public static void main(String[] args) {
        try {
            int a=10;
            int b=10;
            int c;
            c=a+b;
            throw new myExcep("This is my Exception");
        } catch (myExcep e) {
            System.out.println(e);
        }

    }
}
