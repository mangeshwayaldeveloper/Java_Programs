package JavaMahaParactise;

import com.sun.security.jgss.GSSUtil;

public class PrimeNumberWithMethod {
    public static void checkIsPrime(int n){
        int flag=0;
        if(n==0 || n==1){
            System.out.println("Neither Prime");
        }else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Number Is Prime");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println("Number Is Not Prime");
            }
        }
    }
    public static void main(String[] args) {
        checkIsPrime(24);
        checkIsPrime(23);

    }
}
