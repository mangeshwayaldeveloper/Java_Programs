package DsaWithJava;
// program to print the magic number
//  let's consider we have one number with binary of
public class MagicNumber {
    public static void main(String[] args) {
        int n=5;
        int base=5;
        int sum=0;
        while(n>0) {
            int last = n & 1;
            n=n>>1;
            sum+=last*base;
            base=base*5;
        }
        System.out.println(sum);
        }
    }
