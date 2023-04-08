package mathsprt;

public class programOne {
    public static void main(String[] args) {
        double x=81;
        System.out.println(Math.sqrt(x));
        int t=25;
        float n=13;
        long l=-34;
        double d=-82;
        System.out.println(Math.sqrt(t));
        System.out.println(Math.sqrt(n));
        System.out.println(Math.sqrt(l));// negative number is printed as NaN (not a number)
        System.out.println(Math.sqrt(d)); // negative numbers are ignored

    }
}
