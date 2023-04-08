import java.util.Scanner;

public class InputArrayTwoD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numbers Of element for rows");
        int a=s.nextInt();
        System.out.println("Enter Numbers Of element for coloumn");
        int b=s.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("Enter Elements inside of the array");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
