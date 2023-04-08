class student{
    int id;
    String name;
    void setId(int id){
        this.id=id;
    }
    int getId(){
        return this.id;
    }
}
public class AfterThis {
    public static void main(String[] args) {
        student st=new student();
        st.setId(102);
        System.out.println(st.getId());

    }
}
