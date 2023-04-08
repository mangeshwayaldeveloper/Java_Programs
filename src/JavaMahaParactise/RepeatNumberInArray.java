package JavaMahaParactise;
//bitwise operator
public class RepeatNumberInArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,3,5,1,2};
        int temp=0;
        for (int i=0;i<arr.length;i++){
         temp^=arr[i];
        }
        System.out.println(temp);
    }
}
