public class varArgsInJava {
    static int sum = 0;

    static void varArgs(int... v) {
        for (int i : v) {
            sum = sum + i;
        }
    }

    public static void main(String[] args) {
        varArgs(8, 2, 10);
        System.out.println(sum);
    }
}
