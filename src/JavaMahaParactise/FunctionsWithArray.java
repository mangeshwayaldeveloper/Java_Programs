package JavaMahaParactise;

import java.util.Arrays;

public class FunctionsWithArray {
    public static void main(String[] args) {
        int [] arr={23,5,6,3,8,9};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void fun(int [] p){
        p[0]=5;

    }
}
