package JavaMahaParactise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.jar.Manifest;

public class kueue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("Rahul");
        queue.add("Sanorita");
        queue.add("vinay");
        queue.add("mangesh");
        queue.add("wayal");
        queue.add("Entrepreneur");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.offer("xya");
    }
}

