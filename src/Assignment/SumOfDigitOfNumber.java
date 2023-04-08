package Assignment;

import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        try {
            Scanner n = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = n.nextInt();
            int rem;
            int sum = 0;
            while (num != 0) {
                rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            System.out.println(sum);
        }catch (Exception e){
            System.out.println("Give The Correct Input "+e);
        }
    }
}
