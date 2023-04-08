package JavaMahaParactise;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        int base=5;
        while(n>0){
            int last=n&1;
            sum+=last*base;
            base=base*5;
            n=n>>1;
        }
        System.out.println(sum);
    }
}
