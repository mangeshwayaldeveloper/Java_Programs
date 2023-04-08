package Assignment;

public class NullMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        System.out.println("The Matrix is Null: " + nullMatrix(arr));
    }

    static boolean nullMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!(arr[i][j] == 0)) {
                    return false;
                }
            }
        }
        return true;
    }
}