public class Main {
   public static void main(String[] args) {
      // Adjacency List = an array/Arraylist of LinkedLists
      // Each LinkedList has a unique node at the head
      // All adjacency neighbors to that node are added to that node's Linkedlist

      // run-time complexity to check an edge O(v)
      // space complexity O(v+e)

      Graph graph = new Graph();

      graph.addNode(new Node('A'));
      graph.addNode(new Node('B'));
      graph.addNode(new Node('C'));
      graph.addNode(new Node('D'));
      graph.addNode(new Node('E'));

      graph.addEdge(0, 1); // A-B
      graph.addEdge(1, 2); // B-C
      graph.addEdge(1, 4); // B-E
      graph.addEdge(2, 3); // C-D
      graph.addEdge(2, 4); // C-E
      graph.addEdge(4, 0); // E-A
      graph.addEdge(4, 2); // E-C

      graph.print();

      System.out.println(graph.checkEdge(3, 4)); // D-E
   }
}
