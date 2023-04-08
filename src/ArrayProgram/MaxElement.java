package ArrayProgram;

public class MaxElement {
    public static void main(String[] args) {
        int marks[] = {2, 3, 4, 6, 75, 33, 56, 4, 3245, 345, 2352};
        int highest_marks=maximum(marks);
        System.out.println("The Highest Marks Of the Student= "+highest_marks);
    }
    public static int maximum(int[] number){
        int max=number[0];
        for (int num:number){
            if (num>max){
                max=num;
            }
        }
        return max;
    }
}
