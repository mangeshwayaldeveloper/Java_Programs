package DsaWithJava;

public class ArrayUnique {
    public static void main(String[] args) {
        int []ar={2,4,3,2,4,5,5};
        int temp=0;
        for (int i=0;i<ar.length;i++){
            temp=ar[i];
            if((temp^i)!=0){
                System.out.println(temp);
            }
        }
    }
}

