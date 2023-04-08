package Collection;

import java.util.ArrayList;

public class Cloning {
    public static void main(String[] args) {
        ArrayList<Integer> lang=new ArrayList<>();
        lang.add(1);
        lang.add(10);
        lang.add(1,23);
        lang.add(18);
        System.out.println("Arraylist"+lang);
        ArrayList<Integer> clone=(ArrayList<Integer>)lang.clone();
        System.out.println("Clone"+clone);
    }
}
