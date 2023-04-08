package Assignment;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A Number in Digit Only");
        int n=s.nextInt();
        printNumbers(n);
    }
    static void printNumbers(int num){
        String number = num+"";
        String temp;
        int sl = number.length();;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            temp = switch (ch){
                case '1' -> "One";
                case '2' -> "Two";
                case '3' -> "Three";
                case '4' -> "Four";
                case '5' -> "Five";
                case '6' -> "Six";
                case '7' -> "Seven";
                case '8' -> "Eight";
                case '9' -> "Nine";
                case '0' -> "Zero";
                default -> throw new IllegalStateException("Unexpected value: " + ch);
            };
            String st = switch (sl){
                case 2 -> "ty ";
                case 3 -> "-Hundred ";
                case 4 -> "-Thousand ";
                case 6 -> "-Lakhs ";
                default -> "";
            };
            sl--;
            answer.append(temp).append(st);
        }
        System.out.println(answer);
    }
}
