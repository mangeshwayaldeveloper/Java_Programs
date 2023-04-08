class E{
    int data=10;
    void show(){
        System.out.println("This is the A class"); //this is also called when we call show method
    }
    void display(){
        System.out.println("This method has the same name");
    }
}
class F extends E{
    int data=20;
    void display(){
        super.display();
        show(); // to call the class method
        System.out.println(data);
        System.out.println(super.data);
    }
}
public class anonymousObject {
    public static void main(String[] args) {
        new F().display();
//        b.show();
//        c.display();

    }
}
