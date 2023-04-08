class Student{
    public int roll_no;
    public String naam;
    Student(int roll_no, String naam) {
        this.roll_no = roll_no;
        this.naam = naam;
    }
}
public class StudentArray {
    public static void main(String[] args) {
        Student[] arr=new Student[5];
        arr[0]=new Student(1,"mangesh");
        arr[1]=new Student(2,"Wayal");
        arr[2]=new Student(3,"is ");
        arr[3]=new Student(4,"a ");
        arr[4]=new Student(5,"good ");

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].roll_no+" "+arr[i].naam);
        }


    }
}


