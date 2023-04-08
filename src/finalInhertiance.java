class K
{
    void show()
    {
        System.out.println("final method");
    }
}
class J extends K{
    void show(){
        System.out.println("this");
    }
}
public class finalInhertiance {
    public static void main(String[] args) {
        J j=new J();
        j.show();
    }
}
