package AssignmentTwo;
class myException extends Exception{
    }
public class Question3 {
    public static void main(String[] args) {
        try{
            throw new myException();
        }catch (myException e){
            System.out.println(e);
            System.out.println("This is the handling of my custom exception");
        }

    }
}
