package Assignment;
// program to reverse the number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A number");
        int a = s.nextInt();
        int rem;
        int reverse=0;
        while (a != 0) {
            rem=a%10;
            reverse=(reverse*10)+rem;
            a=a/10;
        }
        System.out.println(reverse);
    }
}