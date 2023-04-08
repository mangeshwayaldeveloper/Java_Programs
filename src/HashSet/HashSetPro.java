package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPro {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Mahesh");
        set.add("Mangesh");
        set.add("Rishikesh");
        HashSet<String> set1 = new HashSet<>();
        set1.add("Piyush");
        set.add("Saurabh");
        set.addAll(set1);
        set.removeAll(set1);
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(set);
    }
}
