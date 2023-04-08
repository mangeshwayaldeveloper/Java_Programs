package ConditionalStatements;

import java.util.Scanner;

public class checkCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            char ch = in.next().trim().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lower Case");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Upper Case");
            }else {
                System.out.println("Not A AlphaBet");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
