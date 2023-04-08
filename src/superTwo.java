class Studnet {
    void ms() {
        System.out.println("hii");
    }
}

class B extends Studnet {
    void ms() {
        System.out.println("ashis");
    }
    void d(){
        ms();
    super.ms();
    }
}

public class superTwo {
    public static void main(String[] args) {
        B nb = new B();
        nb.d();
    }
}
