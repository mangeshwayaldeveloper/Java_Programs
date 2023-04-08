package Loops;

import java.util.Scanner;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Enter Number to find occurance ");
        int b=s.nextInt();
        int rem;
        int rev=0;
        int count=0;
        while (a!=0){
            rem=a%10;
//            rev+=rev*10+rem;
            a=a/10;
            if (b==rem){
                count++;
            }
        }
        System.out.println("number "+b+" occurs "+count+" times");
    }
}
