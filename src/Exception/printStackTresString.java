package Exception;

public class printStackTresString {
    public static void main(String[] args) {
        int a=4;
        int b=0;
        try {
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
