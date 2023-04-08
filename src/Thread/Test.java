package Thread;

class Demo extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Demo p=new Demo();
        p.start();
        try{
            System.out.println("Current thread ");
            p.join();
        }catch (Exception e){

        }
        Demo t=new Demo();
        t.start();
    }
}