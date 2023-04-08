package Abstracts;

public abstract class abstractClasses {
    abstract public void show(String name);

    public static void main(String[] args) {
        dj saurabh=new dj();
        saurabh.show("mangesh");
    }
}
class dj extends abstractClasses{
    public void show(String name){
        System.out.println("This is the show of dervied by " +name);
    }


}
