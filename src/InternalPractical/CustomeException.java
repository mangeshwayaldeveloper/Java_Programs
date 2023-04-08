package InternalPractical;
class myException extends Exception{
    public void message(){
        System.out.println("This is custom Exception");
    }
}
public class CustomeException extends Exception{
    public void tryingExcpt() {

        try {
            throw new myException();

        }catch (myException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        CustomeException ct=new CustomeException();
        ct.tryingExcpt();
    }

}
