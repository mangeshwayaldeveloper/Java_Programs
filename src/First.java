class t2 extends Thread {
    t2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread is runnning for second time ");
        }
        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class First extends Thread {
    First() {

        for (int i = 0; i < 5; i++) {
            System.out.println("This is the thread");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        First ft = new First();
        ft.start();
        t2 t=new t2();
        t.start();
        t.setPriority(MIN_PRIORITY);
        ft.setPriority(MAX_PRIORITY);
    }
}

