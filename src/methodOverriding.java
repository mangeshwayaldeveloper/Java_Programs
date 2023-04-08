class C{
    int data=10;
    void show(){
        System.out.println("This is the A class"); //this is also called when we call show method
    }
    void display(){
        System.out.println("This method has the same name");
    }
}
class D extends A{
    int data=20;
    void display(){
        super.display();
        show(); // to call the class method
        System.out.println(data);
        System.out.println(super.data);
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        C c=new C();
//        b.show();
        c.display();

    }
}
