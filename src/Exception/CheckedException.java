package Exception;

public class CheckedException {
    public static void main(String[] args) {
//        File n = new File("C://User//mange//Interview.txt");
//        FileReader fr = new FileReader(n);

        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hi");
    }
}
