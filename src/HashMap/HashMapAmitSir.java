package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapAmitSir {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 1);
        hashMap.put("Js", 3);
        hashMap.put("Research Methodology", 2);

        //replace the number or value

        // here string is key and number is value
        hashMap.replace("Java",10);

        System.out.println(hashMap.get("Java"));
        System.out.println(hashMap);
//        System.out.println("Hello, World!");
        //return set of view of keys
        System.out.println(hashMap.keySet());
        // set of values
        System.out.println(hashMap.values());
        // entry set key value pairs
        System.out.println(hashMap.entrySet());
        // print the key value
        System.out.println("These are the Keys");
        for(String a:hashMap.keySet())
        {
            System.out.println(a);
        }
        // print the values
        System.out.println("These are the values");
        for (int a:hashMap.values()){
            System.out.println(a);
        }
        //
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.println(entry);
        }
//        remove the element
        Integer value= hashMap.remove("Java");
        System.out.println("Value is "+value);

    }
}
