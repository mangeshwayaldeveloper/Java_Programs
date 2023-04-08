package Exception;
// it only prints the description of the exception
public class printStackTresGetMessage {
    public static void main(String[] args) {
        int a=8;
        int b=0;
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
