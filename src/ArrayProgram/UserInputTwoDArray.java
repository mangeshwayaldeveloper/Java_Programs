package ArrayProgram;

import java.util.Scanner;

public class UserInputTwoDArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int in=s.nextInt();
        System.out.println("Enter Number Of coloumns");
        int intwo=s.nextInt();
        int arr[][]=new int[in][intwo];
        System.out.println("Enter element in individual row");
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
