package ArrayProgram;

import java.util.Scanner;

public class sortArrayUsingLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Input");
        int a=s.nextInt();
        System.out.println("Enter Another Input");
        int b=s.nextInt();
        int[][]arrays=new int[a][b];
        for (int i=0;i<arrays.length;i++){
            for (int j=0;j<arrays[i].length;j++){
                arrays[i][j]=s.nextInt();
            }
        }
        int temp=0;
        for (int i=0;i<arrays.length;i++){
            for (int j=0;j<arrays[i].length;j++){
                for (int k=j+1;k<arrays[i].length;k++){
//                    if (arrays[j]>arrays[k]){
//                        temp=arrays[i];
//                        arrays[j]=arrays[k];
//                        arrays[k]=temp;
                    }
                }
            }
        }
    }
//}
