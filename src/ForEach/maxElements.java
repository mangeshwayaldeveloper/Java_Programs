package ForEach;

public class maxElements {
    public static void main(String[] args) {
        int arr[]={23,5,3,6,3,63,5,3};
        int var=0;
        for (int num:arr){
            if (var<num){
                var=num;
            }
        }
        System.out.println(var);
    }
}
