import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        //the number which is divisible by itself and 1 only
        Scanner sc=new Scanner(System.in);
        boolean isPrime=false;

        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0) {
                isPrime=true;
                break;
            }
        }
        if (isPrime){
            System.out.println("Number is not prime");
        }else {
            System.out.println("Number is prime");
        }
    }
}
