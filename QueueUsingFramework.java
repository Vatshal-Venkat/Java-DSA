//We shouldn't write new Queue<>(); because in java, Queue is an interface and not a class. We cannot create an object of an interface.
// We can also use new ArrayDeque<>(); in place of LinkedList (Deque is Double Ended Queue).

import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
