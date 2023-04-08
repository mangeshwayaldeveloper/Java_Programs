package ArrayProgram;

import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        int arr[]={14,3,2,4,32};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] arr){
        arr[0]=99;

    }
}
