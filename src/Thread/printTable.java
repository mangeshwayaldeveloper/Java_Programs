package Thread;
class Table extends Thread{
    synchronized void printTable(int n){
        for (int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class printTable extends Thread {
    public static void main(String[] args) {
    Table t=new Table();
    t.start();
    }
}
