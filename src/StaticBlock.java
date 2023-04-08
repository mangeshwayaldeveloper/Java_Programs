class staticBlocks{

}
public class StaticBlock {
    static{
        System.out.println("This Static Block");
    }
    static void show(){
        System.out.println("this is the static method");
    }
    public static void main(String[] args) {
        System.out.println("this is the main block");
        show();
    }
}
