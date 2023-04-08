package DsaWithJava;

public class BitwiseXor {
    public static void main(String[] args) {
        int []as={2,3,67,2,3};
        int temp=0;
        for(int i=0;i<as.length;i++) {
            temp = temp ^ as[i];
            //temp(0)= temp(0) ^ as[0](2)
            //temp(2)= temp(2) ^ as[1](3)
            // like wise at the end we get the element which is not repeating
        }
        System.out.println(temp);
    }
}
