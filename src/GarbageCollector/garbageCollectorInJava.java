package GarbageCollector;
class collect{
    int a;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("All these objects are destroyed");
    }
}
public class garbageCollectorInJava {
    public static void main(String[] args) {
        collect obj;
        for (int i=0;i<1000000;i++){
            obj=new collect();
        }
    }
}
