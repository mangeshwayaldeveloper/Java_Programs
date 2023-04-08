package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPro {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
