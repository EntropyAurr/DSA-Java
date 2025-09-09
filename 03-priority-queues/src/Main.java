import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
   public static void main(String[] args) {
      // Priority Queue = FIFO data structure that serves elements with the highest priority first
      // before elements with lower priority

      // Queue<Double> queue = new PriorityQueue<>();
      Queue<Double> doubleQueue = new PriorityQueue<>(Collections.reverseOrder());
      Queue<String> stringQueue = new PriorityQueue<>();
      Queue<Integer> integerQueue = new PriorityQueue<>();

      doubleQueue.offer(3.2);
      doubleQueue.offer(2.8);
      doubleQueue.offer(4.0);
      doubleQueue.offer(3.7);
      doubleQueue.offer(1.5);

      stringQueue.offer("C");
      stringQueue.offer("D");
      stringQueue.offer("A");
      stringQueue.offer("B");
      stringQueue.offer("F");

      integerQueue.offer(20);
      integerQueue.offer(22);
      integerQueue.offer(18);
      integerQueue.offer(28);
      integerQueue.offer(31);

      System.out.print("Double priority queue in reverse order: ");
      System.out.println(doubleQueue);

      System.out.print("String priority queue: ");
      System.out.println(stringQueue);

      System.out.print("Integer priority queue: ");
      System.out.println(integerQueue);
      System.out.println(integerQueue.peek());
   }
}
