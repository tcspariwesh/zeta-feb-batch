import java.util.LinkedList;
import java.util.List;

public class QueueDemo {
    public static void main(String[] args) {
        List<String> queue = new LinkedList<>();
        // Adding elements
        queue.add("Amit");
        queue.add("Neha");
        queue.add("Ravi");
        System.out.println("Initial Queue: " + queue);
        // Peek (view head without removing)
        System.out.println("Head element: " + queue.peek());
        // Remove head
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);
    }
}
