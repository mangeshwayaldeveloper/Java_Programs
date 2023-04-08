import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number For Action ");
        int b=s.nextInt();
        switch (b){
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            case 3:
                System.out.println("This is case 3");
                break;
            case 4:
                System.out.println("this is case 4");
                break;
            default:
                System.out.println("Wrong Input");
        }


    }
}
