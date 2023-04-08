package JavaMahaParactise;

import java.util.LinkedList;

public class ClasLinekdList {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Mangesh");
        linkedList.add("Mahesh");
        linkedList.add("Vijay");
        linkedList.add("Pavan");
        linkedList.add(1,"Yedika");
        System.out.println(linkedList);
        System.out.println(linkedList.get(4));
        linkedList.set(2,"Kotlin");
        System.out.println(linkedList);
        System.out.println("We Are Printing the for each loop");
        for (String a:linkedList){
            System.out.print(" "+a);
        }
linkedList.clear();
    }
}
