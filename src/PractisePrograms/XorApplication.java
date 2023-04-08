package PractisePrograms;

public class XorApplication {
    public static void main(String[] args) {
        int ar[] = {12, 34, 23, 34, 12, 56, 56, 23, 67};
        int temp = 0;

        for (int i : ar) {
            temp=temp^ i;
        }
        System.out.println(temp);
    }
}
