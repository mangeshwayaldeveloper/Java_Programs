import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0;
        int rev;
        while(a!=0){
            rem=a%10;
            rev=(rem*10)+rem;
        }
    }
}
