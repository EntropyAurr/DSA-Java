public class Main {
   public static void main(String[] args) {
      // Adjacency matrix = an 2D array to store 1 & 0 to represent edges
      //                  # of rows = # of unique nodes
      //                  # of columns = # of unique nodes

      // run-time complexity to check an edge = O(1)
      // space complexity = O(v^2)

      Graph graph = new Graph(5);

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

      System.out.println(graph.checkEdge(0, 1));
      System.out.println(graph.checkEdge(3, 2));
   }
}
