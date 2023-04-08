package Thread;

public class StringDemo {
    public static void main(String[] args) {
    String s="mangeshWayal";
        System.out.println(s);
        String s1=new String("Mca");
        System.out.println(s1);
        String s2="mangesh";
        System.out.println(s2);
        System.out.println(s2==s1);
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s.compareTo(s2));
    }
}
