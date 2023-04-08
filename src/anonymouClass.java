public abstract class anonymouClass {
    anonymouClass(){
        System.out.println("this is the constructor");
    }
    abstract void eat();
}
class Testing{
    public static void main(String[] args) {
        anonymouClass n=new anonymouClass() {
            @Override
            void eat() {
                System.out.println("Hiiii");
            }
        };
        n.eat();
    }
}
