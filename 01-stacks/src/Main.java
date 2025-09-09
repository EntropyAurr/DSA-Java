import java.util.Stack;

public class Main {
   public static void main(String[] args) {
      // stack = LIFO data structure - Last-In First-Out
      // stores objects into a sort of "vertical tower"

      Stack<String> stack = new Stack<>();

      stack.push("Genshin Impact");
      stack.push("Honkai Star Rail");
      stack.push("Star Dew Valley");
      stack.push("Final Fantasy VII");

      String lastGame = stack.pop();

      System.out.println(lastGame);
      System.out.println("Top element of the stack: " + stack.peek());
      System.out.println(stack);
      System.out.println("Length of the stack: " + stack.size());
      System.out.println(stack.search("Honkai Star Rail"));
   }
}
