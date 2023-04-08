package JavaMahaParactise;

public class FunctionOverloading {
    public static void main(String[] args) {
run(4,5,5);
run(2,5);
    }
    static void run(int a,int b){
        System.out.println(a);
    }
    static void run(int a,int b,int c){
        System.out.println("This is the function overloading which is in the static context");
    }
}
