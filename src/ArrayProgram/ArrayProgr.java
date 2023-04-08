package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int a = s.nextInt();
        System.out.println("Enter Number Of Columns");
        int b = s.nextInt();
        int arr[][] = new int[a][b];
        System.out.println("Enter Element inside of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int[] r : arr) {
            System.out.println(Arrays.toString(r));
        }
    }
}