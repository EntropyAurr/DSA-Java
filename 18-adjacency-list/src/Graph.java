import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
   ArrayList<LinkedList<Node>> adjList = new ArrayList<LinkedList<Node>>();

   public void addNode(Node node) {
      LinkedList<Node> currentList = new LinkedList<>();
      currentList.add(node);
      adjList.add(currentList); // add to the end of the ArrayList
   }

   public void addEdge(int i, int j) {
      LinkedList<Node> currentList = adjList.get(i);
      Node dstNode = adjList.get(j).getFirst(); // find the destination node that will be linked to
      currentList.add(dstNode);
   }

   public boolean checkEdge(int i, int j) {
      LinkedList<Node> currentList = adjList.get(i);
      Node dstNode = adjList.get(j).getFirst();

      for (Node node : currentList) {
         if (node.equals(dstNode)) return true;
      }
      return false;
   }

   public void print() {
      for (LinkedList<Node> currentList : adjList) {
         for (Node node : currentList) {
            System.out.print(node.data + " -> ");
         }
         System.out.println();
      }
   }
}
