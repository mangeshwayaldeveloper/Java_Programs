package ConditionalStatements;

import java.util.Scanner;

public class FibonWhile {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        int count=2;
        while (count<=n){
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
            count++;
        }
    }
}
