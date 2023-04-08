public class StackHeap {
    public static void main(String[] args) {
        int i=1;
        Object obj=new Object();
        StackHeap mem=new StackHeap();
        mem.foo(obj);
    }
    private void foo(Object param){
        String str=param.toString();
        System.out.println(str);
    }
}
