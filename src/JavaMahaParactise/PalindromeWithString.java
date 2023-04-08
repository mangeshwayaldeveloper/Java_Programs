package JavaMahaParactise;

import java.util.Scanner;

public class PalindromeWithString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A String");
        String t = s.nextLine();
        String st = "";
        int length = t.length();
        for (int i = length - 1; i >= 0; i--)
            st = st +  t.charAt(i);
        if (t.equals(st))
            System.out.println("Enter/String Is Palindrome");
        else
            System.out.println("Not A Palindrome");
    }

}

