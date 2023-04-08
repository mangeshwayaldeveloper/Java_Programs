package PractisePrograms;

public class Palindrome {
    public static void main(String[] args) {
        palindrome(250);
    }
    static void palindrome(int n){
        for (int i = 100; i < n; i++) {
            int rev = 0;
            int temp = i;
            while(temp>0){
                int rem = temp%10;
                rev = rev*10+rem;
                temp /= 10;
            }
            if(i == rev){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}