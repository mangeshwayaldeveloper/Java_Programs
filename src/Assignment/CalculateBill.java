package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateBill {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number Of Units");
        int units = scanner.nextInt();
        double Bill = 0;
            if (0 < units && units < 100) {
                Bill = units * 2.0;
                System.out.println("You Have To Pay " + Bill);
            } else if (units < 301) {
                Bill = 100 * 2 + (units - 100) * 3.70;
                System.out.println("You Have To Pay " + Bill);
            } else if (units < 501) {
                Bill = 100 * 2 + 200 * 3.70 + (units - 300) * 5.0;
                System.out.println("You Have To Pay " + Bill);
            } else {
                System.out.println("You Don't Have Entered Correct Unit");
            }
        }catch (InputMismatchException e){
            System.out.println("Your Don't Have Entered Correct Number "+e);
        }
    }
}
