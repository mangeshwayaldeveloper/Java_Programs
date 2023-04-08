package ConditionalStatements;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("The Largest Number Is "+a);
            }else {
                System.out.println("The Largest Number Is "+c);
            }
        }else{
            if (b>c){
                System.out.println("The Largest Number Is "+b);
            }else {
                System.out.println("The Largest Number Is "+c);
            }
        }
    }
}