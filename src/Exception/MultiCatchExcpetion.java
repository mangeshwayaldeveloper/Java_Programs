package Exception;

public class MultiCatchExcpetion {
    public static void main(String[] args) {
        try {
            args[0]="34";
            int a=13;
            int b=0;
            int c=a/b;
            System.out.println("First Print The statement in try block");
            System.out.println(c);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
