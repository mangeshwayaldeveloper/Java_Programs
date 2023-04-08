class collge{
    int id;
    String name;
    static String colle_name="DPU";

    public static void change() {
        
    }

    public void show() {
    }
}
public class studentwithstatic {
    public static void main(String[] args) {
        collge.change();
        collge c=new collge();
        c.show();
    }
}
