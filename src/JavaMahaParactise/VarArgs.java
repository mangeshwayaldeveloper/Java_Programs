package JavaMahaParactise;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(3,4,5,6,7,8,54,6);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
