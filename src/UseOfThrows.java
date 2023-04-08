public class UseOfThrows {
    public static void useOfThrows() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("This is the throws block");
        int a = 120;
        int b = 0;
        int c = a / b;
        System.out.println(c);
        int[] arr = new int[2];
        arr[0] = 23;
        arr[2] = 23;
        arr[1] = 23;
        arr[3] = 23;


    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        try {
            useOfThrows();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
