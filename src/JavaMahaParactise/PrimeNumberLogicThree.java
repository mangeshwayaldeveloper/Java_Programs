package JavaMahaParactise;

import java.util.Scanner;

public class PrimeNumberLogicThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " Number Is Prime");
        } else {
            System.out.println(n + " Is Not Prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i < n; i++) { //5 sqrt 2.1
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
