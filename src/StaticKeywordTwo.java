class studentst{
    static int counter=0;
    public studentst(){
        counter++;
        System.out.println(counter);
    }
}
public class StaticKeywordTwo {
    public static void main(String[] args) {
        studentst st=new studentst();
        studentst st2=new studentst();
        studentst st3=new studentst();
    }
}
