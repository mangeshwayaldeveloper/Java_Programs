package ThisKeyword;

import org.w3c.dom.ls.LSOutput;

class meth{
    void m(){
        System.out.println("Method of the current class");
    }void n(){
        m();
    }
    void m(int a){
        System.out.println(a);
    }
}
public class invokeMethod {
    void m(){
        System.out.println("This is the method");
    }
    public static void main(String[] args) {

        meth m1=new meth();
        m1.n();
        m1.m(3);
        m1.m();
    }
}
