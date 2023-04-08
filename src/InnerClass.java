class first{
    private int age=23;
    private String name="mangesh";
    static void metho(){
        System.out.println("Printing the method of the inner class");
    }
    class second{
        static int m;
        static void show(){
            System.out.println("Printing the variable of outer class in inner class ");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        first.second s= new first().new second();
        s.show();
    }
}
