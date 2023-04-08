package ForEach;

public class LimitationOfForEach {
    public static void main(String[] args) {
        int ar[]={2,3,5,4,2,432,2,4,45};
        for (int num:ar){
            num=num*2;
            // num(2)=2*2=4 this value get printed and next element value get assigned to num
            //num(3)=num(3) * 2
            //num(5)=num(5)*2
            System.out.println(num);
        }
    }
}
