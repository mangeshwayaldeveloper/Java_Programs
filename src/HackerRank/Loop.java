package HackerRank;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;
        for (int i = 0; i < q; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int s = a;
            //2 two rows
            // a=0, b=2, n=10;
            // (a+2^0.b), (a+2^0.b+2^1.b)...(s)+2^n.b)
            for (int j = 0; j < n; j++) {
                s += Math.pow(2, j) * b;  // 0+1.2=2 ---> 2+=2^1.b;
                 System.out.println(s);

            }

        }
    }
}