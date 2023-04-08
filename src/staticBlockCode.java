public class staticBlockCode {
    static {
        System.out.println("This is the static block");
    }
    public static void m1(){
        System.out.println("This is the static method");
    }
    public static void main(String[] args) {
        System.out.println("This is the main method");
        m1();
    }
}
