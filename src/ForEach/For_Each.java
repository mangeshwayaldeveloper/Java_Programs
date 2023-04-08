package ForEach;
//sum of all element of array
public class For_Each {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 89, 30};
        int temp = 0;
        for (int i : arr) {
            temp = temp + i;
        }
        System.out.println(temp);
    }
}
