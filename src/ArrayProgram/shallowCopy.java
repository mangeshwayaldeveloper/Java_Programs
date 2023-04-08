package ArrayProgram;

public class shallowCopy {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a[][]=arr.clone();
        System.out.println(a==arr); // this is the deep copy by using the clone method
        System.out.println(a[0]==arr[0]);// this is the shallow copy of sub arrays
    }
}
