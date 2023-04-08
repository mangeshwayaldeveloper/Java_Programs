package PractisePrograms;

import java.util.Scanner;

public class FibonaciesSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user input");
        int n=sc.nextInt();

        int a=0,b=1;
        System.out.println(a+" "+b);
        int temp;
        for (int i=2;i<=n;i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
    }
}
