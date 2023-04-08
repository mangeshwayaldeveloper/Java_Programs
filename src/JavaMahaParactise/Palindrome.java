package JavaMahaParactise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem;
        int reverse = 0;
        int temp=n;
        while (n > 0) {
            rem = n % 10;
            reverse = (reverse * 10) + rem;
            n = n / 10;
        }
        if (temp== reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not A palindrome");
        }
    }
}
