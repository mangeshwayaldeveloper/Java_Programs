package Collection;
//program to add delete and remove elements
import java.util.ArrayList;

public class ArrayListWithIntegerQuestion3 {
    public static void main(String[] args) {
        ArrayList<Integer> lang=new ArrayList<>();
        lang.add(1);
        lang.add(10);
        lang.add(11);
        lang.add(12);
        lang.add(13);
        lang.add(14);
        System.out.println("Array List"+lang);
        ArrayList<Integer> programming=new ArrayList<>();
        programming.addAll(lang);
        System.out.println("Programming "+programming);
        lang.removeAll(lang);
        System.out.println("removed lang "+lang);
        programming.clear();
        System.out.println("Programming Removed "+programming);
    }
}
