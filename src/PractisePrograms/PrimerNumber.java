package PractisePrograms;

import java.util.Scanner;

public class PrimerNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        int temp;
        if (n==0|| n==1){
            System.out.println("Invalid number");
        }
        for (int i=2;i<=n;i++){
            if (n%i==0){
                System.out.println("Number is not prime");
                break;
            }else {
                System.out.println("Number is prime");
                break;
            }
        }

    }
}
