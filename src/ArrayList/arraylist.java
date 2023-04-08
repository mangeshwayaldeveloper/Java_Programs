package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number Of Items You Want To add");
        int a=s.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<a;i++){
            list.add(s.nextInt());
        }
        for (int i=0;i<a;i++){
            System.out.println(list.get(i));
        }
    }
}
