package JavaMahaParactise;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter your name");
        String naam=sc.nextLine();
        switch (s){
            case "name"-> System.out.println("my name is "+naam);
            case "msg"-> System.out.println("Message for you is Hiii");
            case "id"-> System.out.println("your id is ");
            case "password"-> System.out.println("your password is");

        }
    }
}
