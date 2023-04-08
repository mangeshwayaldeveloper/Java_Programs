package JavaMahaParactise;

import java.util.Scanner;

// program to print the prime number
// the numbers divisible by itself or by 1 only number
public class Prime_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int a = s.nextInt();
        boolean f = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                f = false;
            }
        }
        System.out.println("Number Is Prime "+f);
    }
}
