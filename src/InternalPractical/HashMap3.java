package InternalPractical;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1, "a");
        m.put(2, "b");
        m.put(3, "d");
        m.put(4, "e");
        m.put(5, "f");
        m.put(6, "g");
        for (Map.Entry mk : m.entrySet()) {
            System.out.println(mk.getKey() + " " + mk.getValue());
        }
    }
}
