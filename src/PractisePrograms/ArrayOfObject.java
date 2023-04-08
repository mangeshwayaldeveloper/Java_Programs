package PractisePrograms;

class Students {
    //    int rollNo;
    public String name;

    Students(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}

public class ArrayOfObject {
    public static void main(String[] args) {
        Students[] std = new Students[]{new Students("mangesh"), new Students("Wayal")};
        for (Students m : std) {
            System.out.println(m);
        }
    }
}
