package Assignment;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {123, 53, 20, 58, 214, 751};
        int ans = secondLargest(arr);
        System.out.println("Second Largest "+ans);
    }

    static int secondLargest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr[arr.length - 2];
    }
}
