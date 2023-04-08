import org.w3c.dom.ls.LSOutput;

class h{
    void show(){
        System.out.println("This is the class h");
    }
}
class f extends h{

void meth(){
    show();
    System.out.println("ruh");
}
}
class j extends h{
    void show(){
        System.out.println("does not make any sense ");
    }
}
public class Hierarchical {
    public static void main(String[] args) {

    j kj=new j();
    f fk=new f();
    kj.show();
    fk.show();
    }
}
