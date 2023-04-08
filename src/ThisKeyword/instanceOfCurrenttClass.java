package ThisKeyword;
class inst{
    inst(){
        System.out.println("This is the instance of the current class");
    }
    inst get(){
        return this;
    }
    public void show(){
        System.out.println("This is the method");
    }
}
public class instanceOfCurrenttClass {
    public static void main(String[] args) {
        inst n=new inst();
        n.show();

    }
}
