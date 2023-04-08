package Collection;

import java.util.ArrayList;

public class ArraylistContains {
    public static void main(String[] args) {
        ArrayList<Integer> lang = new ArrayList<>();
        lang.add(1);
        lang.add(10);
        lang.add(1, 23);
        lang.add(18);
        System.out.println("Arraylist" + lang);
        ArrayList<Integer> clone = (ArrayList<Integer>) lang.clone();
        System.out.println("Clone" + clone);
        System.out.println(lang.contains(10)); // it contains
        System.out.println(lang.get(3)); //get is used to get the element from the particular index
        System.out.println(lang.indexOf(34)); // find the index of element which we are searching\
        System.out.println(lang.size());
        System.out.println(lang.isEmpty());
        System.out.println(lang.subList(1,3));
    }
}