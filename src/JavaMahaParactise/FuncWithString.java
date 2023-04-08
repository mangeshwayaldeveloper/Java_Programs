package JavaMahaParactise;

import java.util.Scanner;

public class FuncWithString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String n=in.next();
        String person=Greet(n);
        System.out.println(person);
    }
    static String Greet(String name){
        String message="This Is Message For "+name;
        return message;
    }
}
