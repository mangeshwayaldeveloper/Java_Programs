class  students{
int id;
String name;
static String college_name="DYPIMR";
void show(){
    System.out.println(id+" "+name);
}
public students(int id, String name){
    this.id=id;
    this.name=name;
}
}
public class StaticKeyword {
    public static void main(String[] args) {
        students s=new students(102,"MCA");
        students s1=new students(103,"MCA1");
        s.show();

    }
}
