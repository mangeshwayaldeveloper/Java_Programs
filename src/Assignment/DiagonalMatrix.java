package Assignment;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 0, 0},
                {0, 0, 0},
                {0, 0, 5}
        };
        System.out.println("The matrix is Diagonal : " + diagonalMatrix(arr));
    }

    static boolean diagonalMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!(i == j) && arr[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
