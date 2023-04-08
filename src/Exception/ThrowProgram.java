package Exception;

public class ThrowProgram {
    public static void funt() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("caught inside fun");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            funt();
        } catch (NullPointerException e) {
            System.out.println("This is inside of the main");
        }

    }
}
