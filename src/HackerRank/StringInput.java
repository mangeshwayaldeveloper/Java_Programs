package HackerRank;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        scan.nextLine();
        String s=scan.nextLine();
        double d=scan.nextDouble();
        System.out.println("integer "+i);
        System.out.println("String "+s);
        System.out.println("Double "+d);

    }
}
