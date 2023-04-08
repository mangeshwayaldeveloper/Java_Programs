import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
//        for (int j=0;j<arr.length;j++){
//            System.out.println(arr[j]);
//        }
    }
}
