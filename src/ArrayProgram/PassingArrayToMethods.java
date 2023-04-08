package ArrayProgram;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 5};
        sum(arr);
    }
        public static void sum (int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i]; //sum=2--> sum(2)=(2)+ar[i](4) sum-->
        }
            System.out.println("sum of array values: "+sum);
    }
}
