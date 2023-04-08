package Assignment;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a Number To Print Pattern");
            int n = s.nextInt();
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }catch (Exception e){
            System.out.println("Enter Proper Input "+e);
        }
    }
}
