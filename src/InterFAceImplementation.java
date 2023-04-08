interface i3 {
    public void t1();

    public void t2();
}

public class InterFAceImplementation implements i3 {
    public void t1() {
        System.out.println("this is the m1");
    }

    @Override
    public void t2() {
        System.out.println("this is the t2");
    }

    public static void main(String[] args) {
        InterFAceImplementation i=new InterFAceImplementation();
        i.t1();
        i.t2();
    }
}
