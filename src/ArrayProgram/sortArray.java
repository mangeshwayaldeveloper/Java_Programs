package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number For Rows");
        int a = s.nextInt();
        System.out.println("Enter A Number For Columns");
        int b = s.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int[] k : arr) {
                    Arrays.sort(k);
                    System.out.println(Arrays.toString(k));
                }
            }

        }
    }
    }