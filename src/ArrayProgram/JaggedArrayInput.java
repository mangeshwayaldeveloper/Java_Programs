package ArrayProgram;

import java.util.Scanner;

public class JaggedArrayInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size Of Row");
        int a=s.nextInt();
        System.out.println("Enter Number Of Columns");
        int b=s.nextInt();
        int [][]arr=new int[a][b];
        System.out.println("Enter Elements In Array");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }

        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
