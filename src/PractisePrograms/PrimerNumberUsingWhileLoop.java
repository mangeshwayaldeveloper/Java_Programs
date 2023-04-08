package PractisePrograms;

import java.util.Scanner;

public class PrimerNumberUsingWhileLoop {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int k = s.nextInt();
        int i = 2;
        int flag = 0;
        if (k == 0 || k == 1) {
            System.out.println("Invalid number");
        }
        while (i < k) {
            if (k % i == 0) {
                flag = 1;
            }
            i++;
        }
        if (flag == 1) {
            System.out.println("Number is not prime");
        }else {
            System.out.println("Number is prime");
        }
    }
}
