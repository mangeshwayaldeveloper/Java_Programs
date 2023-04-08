class classs{
    void display(){
//        public int r; //compiler gives error if we use any access specifier for local variable
//        System.out.println(r);
    }
    void cal(){

    }

}
class LocalVariable {
    String name;
    public static void main(String[] args) {
        LocalVariable obj1=new LocalVariable();
        LocalVariable obj2=new LocalVariable();// we have created two objects
        obj1.name="vinayak";// assign a value for obj1
        obj2.name="pankaj"; // assign value for obj2
        System.out.println(obj1.name); //when we print the different object of same variable it
        System.out.println(obj2.name);//will give two different value
        //it means that object of each instance variable has its own copy
    }
}
