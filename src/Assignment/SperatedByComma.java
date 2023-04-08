package Assignment;

public class SperatedByComma {
    public static void main(String[] args) {
        String str = "HelloEveryOne @ ,Welcome All TO,Javaprogramming ,This is String text,and String line";
        String[] s = str.split("[,]");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}

