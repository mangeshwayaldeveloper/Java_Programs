class animal{
    void legs(){
        System.out.println("Animal have 4 legs");
    }
    void color(){
        System.out.println("this is the white color");
    }
}
class dog extends animal{
    void bar(){
        super.legs();
        System.out.println("Dog bark");
    }
    void color(){
        System.out.println("this is black color");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
    animal d=new dog();
    d.color();  

    }
}
