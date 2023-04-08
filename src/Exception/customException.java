package Exception;
class myException extends Exception{
    public myException(){
     //call constructor of parent exception
//        super(s);
//
    }
}
public class customException {
    public static void main(String[] args) {
        try {
            throw new myException(  );
        }catch (myException e){
            System.out.println(e);
            System.out.println("Exception is created by me");
        }
    }

}
