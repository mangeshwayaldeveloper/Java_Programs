package InternalPractical;

import java.util.HashMap;
import java.util.Map;

public class HashMapPro {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("mango1",1);
        map.put("mango2",2);
        map.put("mango3",3);
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
