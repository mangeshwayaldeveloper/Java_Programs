package ConditionalStatements;

import java.util.Scanner;

public class Fibnacii {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int temp=0;
        for (int i=2;i<=n;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
        }
    }
}
