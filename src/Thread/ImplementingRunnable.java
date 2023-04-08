package Thread;
class thread12 implements Runnable{
    public void run(){
        System.out.println("Running");
    }
}
public class ImplementingRunnable {
    public static void main(String[] args) {
        thread12 t=new thread12();
        Thread t1=new Thread(t,"This is my thread");
        t1.start();
        String st=t1.getName();
        System.out.println(st);

    }


}
