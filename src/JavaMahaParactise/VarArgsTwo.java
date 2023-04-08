package JavaMahaParactise;

import java.util.Arrays;

public class VarArgsTwo {
    public static void main(String[] args) {
        mutiple(2,3,"mangesh","Wayal");
    }
    static void mutiple(int a, int b, String...v){
        System.out.println(a+" "+b+" "+ Arrays.toString(v));
    }
}
