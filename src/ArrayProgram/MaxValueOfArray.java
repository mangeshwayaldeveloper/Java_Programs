package ArrayProgram;

public class MaxValueOfArray {
    public static void main(String[] args) {
        int[] arr={290,3,4,45,6,7};
        int temp=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
