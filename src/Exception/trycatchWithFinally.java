package Exception;

import java.util.Scanner;

public class trycatchWithFinally {
    public static void main(String[] args) {
        int a=5;
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        try{

            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("If You Enter 0 Then Only Exception Occurs OtherWise Not");
        }
    }
}
