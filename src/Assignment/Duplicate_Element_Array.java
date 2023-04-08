package Assignment;

public class Duplicate_Element_Array {
    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 32,45};
        int temp;
        for (int a=0;a<arr.length ; a++) {

            for (int i=a+1;i<arr.length;i++){
                if (arr[a]==arr[i])  //4 == 2 // 4==4  i=0 {0,
                {
                    arr[i]=0;
//                    System.out.println("Element Removed "+temp);
                }
            }
        }
        for (int i:arr){
            System.out.print(" "+i);
        }

    }
}
