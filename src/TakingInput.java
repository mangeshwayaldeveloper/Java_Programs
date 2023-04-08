import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        System.out.println(in.nextInt());
        byte b=42;
        char c='a';
        int i=50000;
        float f=5.64f;
        double d=2_354_423;
        short s=1024;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println(d);
        System.out.println(result);
    }
}
