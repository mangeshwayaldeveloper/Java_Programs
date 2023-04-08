package Thread;

class thread1 extends Thread {
    public void run() {
        System.out.println("BournVita is tatti (*__*)");
    }
}

public class thread {
    public static void main(String[] args) {

        thread1 t = new thread1();
        thread1 t2 = new thread1();
        t.start();
        t2.start();
    }
}
