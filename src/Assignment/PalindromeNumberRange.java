package Assignment;

import java.util.Scanner;

public class PalindromeNumberRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int rem;

        for (int i=100;i<num;i++){
            while (i!=0){
                rem=i%10;
                rev=rev*10+rem;
                i=i/10;
            }
            if (i==rev){
                System.out.println(i);
            }
        }
    }
}
