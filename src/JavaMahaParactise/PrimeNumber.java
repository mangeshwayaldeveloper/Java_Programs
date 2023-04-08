package JavaMahaParactise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        int flag=0;
        if (j == 1 || j == 0) {
            System.out.println("Not A Prime");
        }else {
            for(int i=2;i<j;i++){
                if (j%i==0){
                    System.out.println("Number Not Prime");
                    flag=1;
                    break;
                }
            }
        }
        if (flag==0){
            System.out.println("Number Is Prime");
        }
    }
}