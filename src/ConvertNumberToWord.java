import java.util.Scanner;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int s = sc.nextInt();
        int i;
        int rev=0;
        i=s%10;
        rev=rev*10+i;
        i=i/10;
        while(i!=0)
        {
            switch (i) {
                case 0:
                    System.out.println("zero");
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                default:
                    System.out.println("Not found");
            }
            /*
            101;

             */
        }
    }
}
