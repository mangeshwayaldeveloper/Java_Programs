package Exception;

public class throwAndThrows {
    static void fun() throws Exception {
        System.out.println("Inside fun()");
        throw new Exception("Demo");
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("caught in main");
        }
    }
}
