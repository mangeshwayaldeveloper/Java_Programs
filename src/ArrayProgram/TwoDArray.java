package ArrayProgram;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]={{2,53,24},{621,3},{3,5,2}};
            System.out.println(Arrays.toString(arr));
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++)
            {
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }
//        }
    }
}
