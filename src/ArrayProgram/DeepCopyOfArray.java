package ArrayProgram;

public class DeepCopyOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int copy[]=arr.clone();
        System.out.println(arr==copy);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
