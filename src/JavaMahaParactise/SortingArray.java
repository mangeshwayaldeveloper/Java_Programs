package JavaMahaParactise;

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int temp = 0;
        int[] ar = new int[a];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {

                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
            System.out.println(ar[i]);
        }
    }
}
