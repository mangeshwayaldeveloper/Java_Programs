package Exception;

public class printingTheStackTress {
    public static void main(String[] args) {
        int a=9;
        int b=0;
        try{
            System.out.println(a/b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
