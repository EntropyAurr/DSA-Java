import java.util.LinkedList;

public class Main {
   public static void main(String[] args) {
      // LinkedList = stores Nodes in 2 parts (data + address)
      // Nodes are in non-consecutive memory locations
      // Elements are linked using pointers

      //                   Singly LinkedList
      //       Node              Node                 Node
      // [data | address] -> [data | address] -> [data | address]

      //                   Doubly LinkedList
      //             Node                         Node
      // [address | data | address] <-> [address | data | address]

      // Advantages
      // 1. Dynamic Data Structure (allocates needed memory while running)
      // 2. Insertion and Deletion of Nodes is easy - O(1)
      // 3. No/Low memory waste

      // Disadvantages
      // 1. Greater memory usage (additional pointer)
      // 2. No random access of elements (no index [i])
      // 3. Accessing/searching elements is more time consuming - O(n)

      // Usage:
      // 1. Implement Stacks/Queues
      // 2. GPS navigation
      // 3. Music playlist

      LinkedList<String> linkedList = new LinkedList<>();

      // push() = adds an item to the BEGINNING of the list
      // linkedList.push("A");
      // linkedList.push("B");
      // linkedList.push("C");
      // linkedList.push("D");
      // linkedList.push("F");
      // [F, D, C, B, A]
      // linkedList.pop();
      // System.out.println(linkedList);

      // offer() = adds an item at the END of the list
      // LinkedList as a queue
      linkedList.offer("A");
      linkedList.offer("B");
      linkedList.offer("C");
      linkedList.offer("D");
      linkedList.offer("F");
      // [A, B, C, D, F]
      // linkedList.poll();
      // [B, C, D, F]

      linkedList.add(4, "E");
      // [A, B, C, D, E, F]
      // linkedList.remove();
      // [B, C, D, E, F]
      System.out.println("First element index: " + linkedList.indexOf("A"));
      System.out.println("Last element index: " + linkedList.indexOf("F"));

      System.out.println(linkedList.peekFirst());
      System.out.println(linkedList.peekLast());

      linkedList.addFirst("0");
      linkedList.addLast("1");

      String first = linkedList.removeFirst();
      String last = linkedList.removeLast();

      System.out.println("First: " + first);
      System.out.println("Last: " + last);

      System.out.println(linkedList);

   }
}
