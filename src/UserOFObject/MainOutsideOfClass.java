package UserOFObject;
class Student{
    int roll=10;
    String name="mangesh";
}
public class MainOutsideOfClass {
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st.name);
        System.out.println(st.roll);
    }
}
