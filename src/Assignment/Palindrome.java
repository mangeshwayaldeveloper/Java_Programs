package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number Greater Than 100");
        int num = s.nextInt();
        int rem;
        for (int i = 100; i < num; i++) {
            int temp = i;
            int rev = 0;
            while (temp > 0) {
                rem = temp % 10;
                rev = (rev * 10) + rem;
                temp = temp / 10;
            }
            if (i == rev) {
                System.out.print(i+" ");
            }
        }
    }
}
