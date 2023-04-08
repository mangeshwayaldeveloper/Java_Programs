package JavaMahaParactise;

import java.util.Scanner;
// program to print the fiboncii series
// 0 1 1 2 3 5 ....
// 0 1
// a=0; b=1; sum=a+b;
//b=sum;
//a=b;
public class Fibonaciee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        int c=1;
        int sum=0;
        System.out.println(b);
        System.out.println(c);
        for (int i=1;i<a;i++){
            sum=b+c;
            b=c;
            c=sum;
            System.out.println(sum);
        }


    }
}
