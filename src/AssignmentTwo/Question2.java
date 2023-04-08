package AssignmentTwo;
// for throws
class UsingThrows {
    public static int divide(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }
}
// for throw
class UsingThrow{
    public static void divided(int num){
        if (num<1){
            throw new ArithmeticException("Can't Calculate Square of Negative Number");
        }else {
            System.out.println("Square of "+num+ " is "+num*num);
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        // for throws
        UsingThrows usingThrow = new UsingThrows();

        //for throw
        UsingThrow ut = new UsingThrow();

        // for throws
        try {
            System.out.println(usingThrow.divide(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("Can Not Divide By 0");
        }
        try {

            // for throw
            ut.divided(-3);

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
