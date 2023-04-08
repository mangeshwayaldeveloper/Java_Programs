public class StaticVariable {
    static String name;
    public static void main(String[] args) {
        StaticVariable obj1=new StaticVariable();
        StaticVariable obj2=new StaticVariable();
        obj1.name="mangesh";
        obj2.name="pavan";
        System.out.print(obj1.name+" ");
        System.out.println(obj2.name);

    }
}
