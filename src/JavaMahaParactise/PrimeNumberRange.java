package JavaMahaParactise;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Starting Range");
        int g = s.nextInt();
        System.out.println("Enter Ending Range");
        int h=s.nextInt();
        if ((g == 0 || g == 1)||(h==0||h==1) ) {
            System.out.println("Number Is Neither Prime Or Not Non- Prime");
        } else {
            for (int j = g; j <= h; j++) {
                for (int i = 2; i < j; i++) {
                    if (j % i == 0) {
//                        System.out.println(" Not A Prime");
                        break;
                    } else {
                        System.out.println(j);
                    }
                }
            }
        }
    }
}