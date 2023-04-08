package NestedClass;
//class 1
//helper class

class Outer{
    //class 2
    // inner class
    class Inner{
        // show() method of inner class
        public void show(){
            System.out.println("This is the most inner class in a nested inner class");
        }
    }
}
public class InnerNestedClass {
    public static void main(String[] args) {
        Outer.Inner i=new Outer(). new Inner();
        i.show();
    }

}
