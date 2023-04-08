package Assignment;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter A Number To Perform Calculation");
            int a = s.nextInt();
            int count = 0;
            for (int i = 1; i <= a; i++) { //i=1
                for (int j = 1; j <= i; j++) {
                    count++;
                    System.out.print(count);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Enter Number Only " + e);
        }
    }
}
