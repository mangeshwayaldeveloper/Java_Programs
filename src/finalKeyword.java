class Demo{
    final int age=16; // Blank or unitialise final variable

    public void show() {
        System.out.println(age);
    }
    public Demo(){
//        age=20;
    }

}
public class finalKeyword {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();

    }
}
