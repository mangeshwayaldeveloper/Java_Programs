import java.util.Scanner;

public class Fibonacies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            int num=sc.nextInt();
            int temp=0;
            int a=0;
            int b=1;
            /*
            10
            0
            temp=0+0;
            temp=0+1;
            1
            temp=1+2;

             */
            for(int i=0;i<num;i++){
                temp=b;
                b=b+a;
                a=temp;
                System.out.println(a);
            }
        }
    }
}
