package DsaWithJava;

public class ArrayLetcode {
    public static void main(String[] args) {
        int[] arr = {4, 11, 9, 5, 6,3};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (int k : arr) {
                if (temp + k == 9) {
                    System.out.println("the Numbers are found " + arr[i] + " " + k);
                }
            }
        }
    }
}
