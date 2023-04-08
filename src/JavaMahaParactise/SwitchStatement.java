package JavaMahaParactise;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int emp=in.nextInt();
        in.nextLine();
        String empId=in.nextLine();

        switch (emp){
            case 1:System.out.println("This is the first statement");
            break;
            case 2: System.out.println("This is second statement ");
            break;
            case 3: System.out.println("This is Third statement");
            break;
            case 4:
                System.out.println("This is fifth statement");
                switch (empId) {
                    case "IT" -> System.out.println("IT Department");
                    case "Sales" -> System.out.println("This is the sales ");
                    case "Accountant" -> System.out.println("this is the accountant");
                    case "Head Office" -> System.out.println("This is the head office");
                }
        }
    }
}
