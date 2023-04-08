package JavaMahaParactise;

import java.util.Scanner;

public class PrimeWithRange {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter A Number Starting");
        int a=t.nextInt();
        System.out.println("Enter Number For Ending");
        int z=t.nextInt();
        System.out.println("Number Starting From "+a+" And "+z);
        for (int i=a;i<z;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if (n<1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
