package DsaWithJava;

import java.util.Scanner;

//find number is even or odd using bitwise operator
public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if ((a&1)==1){
            System.out.println("Number odd ");
        }else {
            System.out.println("Number is even");
        }
    }
}
