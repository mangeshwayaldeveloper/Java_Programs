package Assignment;

import java.util.Scanner;

public class NumberTriangle {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Input");
            int n=s.nextInt();
            pattern3(n);
        }
        static void pattern3(int num){
            int n = 1;
            for (int i = 1; i <= num; i++) {
                int t=1;
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print(t+" ");
                    if(j>=i){
                        t--;
                    } else {
                        t++;
                    }
                }
                System.out.println();
            }
        }

    }
