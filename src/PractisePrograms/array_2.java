package PractisePrograms;

public class array_2 {
    public static void main(String[] args) {
        int [] age={12,34,67};
        int ages[]={12,46,74};
        byte[] bytes={4,5,36,5};
        short[]s={3,56,7,7};
        double[] e={4.5,64,6.7,3};
        long[]r={24,645,6,7};
        boolean b[];
        float[] fl={3,6,534,3};
        char ch[]={35,4,6,4};
        System.out.println("Printing the integer type ");
        for(int a:age){
            System.out.println(a);
        }
        System.out.println("Printing the ages with another type of declaration");
        for(int big :ages){
            System.out.println(big);
        }
        System.out.println("Printing the Byte values");
        for(int a1:bytes){
            System.out.println(a1);
        }


    }
}
