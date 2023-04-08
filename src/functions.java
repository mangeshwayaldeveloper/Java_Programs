import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
int d=display();
        System.out.println(d);
    }
    static int display(){
        System.out.println("enter number 1");
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        System.out.println("Enter Number 2");
        int b=in.nextInt();
        Scanner in2=new Scanner(System.in);
        int c=a+b;
        return c;
    }
}
