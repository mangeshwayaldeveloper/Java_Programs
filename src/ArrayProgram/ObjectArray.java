package ArrayProgram;

class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

public class ObjectArray {
    public static void main(String[] args) {
        Student[] arr = new Student[6];
        arr[0] = new Student(1, "mangesh");
        arr[1] = new Student(2, "Rushiksh");
        arr[2] = new Student(3, "Pavan");
        arr[3] = new Student(4, "Arun");
        arr[4] = new Student(5, "All");
        arr[5] = new Student(6, "Good");
        for (int a = 0; a < arr.length; a++) {
            System.out.println("Element At " + a + " " + arr[a].rollno + " " + arr[a].name);
        }

    }
}
