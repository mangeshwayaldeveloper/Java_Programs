package PractisePrograms;

import java.util.Scanner;

public class BetweenPrimeNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting and ending numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int temp;
        if (a==0 || a==1){
            System.out.println("Not A Prime Number");
        }
        while (a>b){
            for (int i=2;i<a;i++){
                if (a%i==0){
                    System.out.println("not a prime number"+a);
                }else {
                    System.out.println("Prime "+a);
                }
                }
            a++;
            }
        if (b>a){
            for (int i=2;i<b;i++){
                if(b%i==0){
                    System.out.println("not a prime number "+a);
                }else {
                    System.out.println("Prime "+b);
                }
                b++;
            }

        }
    }
}
