package DsaWithJava;

import java.util.Scanner;

public class BitwiseAndOddEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int i=s.nextInt();
        System.out.println(isOdd(s.nextInt())+" Number Is Odd");
    }
    public static boolean isOdd(int i){
        return (i&1)==1;
    }
}
