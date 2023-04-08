package UserOFObject;

public class UseOfObject {
    int rollno=29;// data member
    public void show(){ //member function
        System.out.println("Roll number of the student "+rollno);
    }
    public static void main(String[] args) {
        UseOfObject b=new UseOfObject();
        b.show();

    }
}
