package ArrayProgram;

import java.util.Scanner;

public class JaggedArrayT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number Of Rows");
        int b = s.nextInt();
        System.out.println("Enter Number Of Columns");
        int c = s.nextInt();
        int a[][] = new int[b][c];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=s.nextInt();
            }
        }
        for (int[] l :a){
            System.out.println(l);
        }
    }
}
