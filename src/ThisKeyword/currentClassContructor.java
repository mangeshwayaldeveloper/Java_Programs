package ThisKeyword;
class tests{
    tests(){
        this(23,56);
        System.out.println("this is the default constructor");
    }
    tests(int a,int b){
        System.out.println("Value of a is ="+a+" and value of the b is = "+b);
    }
}
public class currentClassContructor {
    public static void main(String[] args) {
        tests ts=new tests();

    }
}
