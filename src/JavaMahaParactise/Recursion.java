package JavaMahaParactise;

public class Recursion {
    //Normal Approach (Aam Zindagi)
//    public static void main(String[] args) {
//        Scanner i = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int s = i.nextInt();
//        int sum = 0;
//        for (int j = 1; j <= s; j++) {
//            sum = sum + j;
//            //sum(0)=0+1 --> sum=1
//            // --> sum(1)=sum(1)+2-->3 sum(3)=sum(3)+3-->
//            // 6 sum(6)=sum(6)+i(4)--> sum=10,
//            // sum(10)=sum(10)+i(5)=sum(15)
//        }
//        System.out.println(sum);
//    }
    public static void main(String[] args) {

        int[] ar = {12, 43, 1, 2, 3}; //sum
        int sum = 0;
        for (int i = 0; i < ar.length - 1; sum += ar[i++]) ;
        System.out.println(sum);
//    public static void main(String[] args) {
//        int result = sum(10);
//        System.out.println(result);
//    }
//
//    public static int sum(int k) {
//        if (k > 0) {
//            return k + sum(k - 1);
//        } else {
//            return 0;
//        }
//    }
    }
}
