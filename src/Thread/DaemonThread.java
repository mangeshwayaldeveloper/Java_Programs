package Thread;
class Tests extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon");
        } else {
            System.out.println("Not Started");
        }
    }
}
public class DaemonThread{
    public static void main(String[] args) {
        Tests t=new Tests();
        t.setDaemon(true);
        t.start();

    }
}
