package HackerRank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class DataTypeRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float a = s.nextFloat();
        BigInteger n;
        for(int i=0;i<5;i++){
            n=s.nextBigInteger();
        }
        if (a >= -(Math.pow(2, 8)) && a < (Math.pow(2, 8) - 1)) {
            System.out.println("it fitted in Byte");
            System.out.println("Fitted In Short");
            System.out.println("Fitted In int");
            System.out.println("Fitted In long");
        } else if (a > -(Math.pow(2, 16)) && a < (Math.pow(2, 16)) - 1) {
            System.out.println("Fitted In Short");
            System.out.println("Fitted In int");
            System.out.println("Fitted In long");
        } else if (a > -(Math.pow(2, 32)) && a < (Math.pow(2, 32)) - 1) {
            System.out.println("Fitted In int");
            System.out.println("Fitted In long");
        } else if (a > -(Math.pow(2, 64)) && a < (Math.pow(2, 64)) - 1) {
            System.out.println(a+"fitted In Long");
            System.out.println(new BigDecimal(a).toPlainString()+"This is the largest value");
        }else {
            System.out.printf("can't fitted");

        }
//        System.out.println(n);
    }

}
