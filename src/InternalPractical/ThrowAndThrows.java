package InternalPractical;

public class ThrowAndThrows extends Exception{
    public void show()throws ArithmeticException{
        System.out.println("this is how we print");
        throw new ArithmeticException("this will throw Exception");
    }

    public static void main(String[] args) {
        ThrowAndThrows ts=new ThrowAndThrows();
        try{
        ts.show();

        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
