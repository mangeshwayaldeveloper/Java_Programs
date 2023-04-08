package ArrayProgram;

import java.util.Arrays;

public class ArrayWithNotFixedSize {
    public static void main(String[] args) {
        int ar[][]={{1,2,4},
                {7,5,8,9,5},{2,3,5,7,9,8}   };
        for (int[]r:ar){
            System.out.println(Arrays.toString(r));
        }
    }
}
