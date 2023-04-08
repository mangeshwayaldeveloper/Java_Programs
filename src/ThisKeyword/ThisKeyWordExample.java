package ThisKeyword;
class Test {
    int a;
    int b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;

    }
}

public class ThisKeyWordExample {
    public static void main(String[] args) {
        Test t = new Test(34, 53);
        System.out.println(t.a + " " + t.b);
    }
}
