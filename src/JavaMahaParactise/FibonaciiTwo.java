package JavaMahaParactise;

import java.util.Scanner;

public class FibonaciiTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int s=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<s;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }

    }
}
