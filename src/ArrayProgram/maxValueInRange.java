package ArrayProgram;

public class maxValueInRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(maxRange(arr,1,4));
    }
    static int maxRange(int [] arr,int start,int end){
        int temp=0;
        for (int i=start;i<=end;i++){
            if (arr[i]>temp){
                temp=arr[i];
            }
        }
return temp;
    }
}
