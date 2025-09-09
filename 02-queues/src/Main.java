import java.util.LinkedList;
import java.util.Queue;

public class Main {
   public static void main(String[] args) {
      // Queue = FIFO data structure - First-In First-Out
      // a collection of designed for holding elements prior to processing
      // this is a linear data structure
      // add = enqueue, offer()
      // remove = dequeue, poll()

      Queue<String> queue = new LinkedList<>();

      System.out.println(queue.isEmpty());

      queue.offer("Karen");
      queue.offer("Chad");
      queue.offer("Steve");
      queue.offer("Harold");

      System.out.println("Head of the queue: " + queue.peek());
      System.out.println(queue.poll());
      System.out.println(queue);
      System.out.println("Size of queue: " + queue.size());
      System.out.println(queue.contains("Steve"));
   }
}
