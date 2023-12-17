import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();

        q1.add("First");
        q1.add("Second");
        q1.add("Third");

        
        System.out.println(q1);
        q1.offer("FF");
        q1.offer("TT");

        System.out.println(q1);

        System.out.println("First element: " + q1.remove()); // First
        System.out.println("Second element: " + q1.poll()); // Second

        System.out.println(q1); // Third, FF, TT
    }
}
