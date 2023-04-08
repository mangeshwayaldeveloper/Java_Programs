package HackerRank;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s",s1);
            if (x>10 && x<100) {
                System.out.printf("0%d", x);
            }else if (x<10){
                System.out.printf("00%d",x);
            }
            else if (x>=100){
                System.out.printf("%d",x);
            }
//            //Complete this lin
//            if (x > 10 && x < 100) {
//                for (int j = 0; j <= 14; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("0");
//            } else if (x < 10) {
//                for (int l = 0; l <=14; l++) {
//                    System.out.print(" ");
//                }
//                System.out.print("00");
//            } else if (x >= 100) {
//                for (int l = 0; l <= 14; l++) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print(x);
//            System.out.println();
        }
        System.out.println();
            System.out.println("================================");
        }
    }