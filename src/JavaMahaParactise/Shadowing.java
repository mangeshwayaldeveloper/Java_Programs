package JavaMahaParactise;
public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        // the value changes here is called shadowing
        // the class variable at line 3 is shadowed here.
        int x=40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);

    }
}

