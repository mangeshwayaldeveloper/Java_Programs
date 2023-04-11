import java.util.Arrays;

public class VarArgsPro {
    static void demo(int... v) {
        System.out.println(Arrays.toString(v));

    }
static void demo(String ...v){
    System.out.println(Arrays.toString(v));
}
    public static void main(String[] args) {
        demo(4, 5, 2, 3, 123, 2);
    }
}
