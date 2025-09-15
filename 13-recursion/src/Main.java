public class Main {
   public static void main(String[] args) {
      // recursive method calls itself
      // common used with advanced sorting algorithms & navigating trees
      // Pros:
      // 1. Easy to read/write
      // 2. Easy to debug
      // Cons:
      // 1. Sometimes slower
      // 2. Use more memory

      walk(5);
      System.out.println(factorial(7));
      System.out.println(power(2, 8));
   }

   private static void walk (int step) {
      if (step <= 1) return; // base case
      System.out.println("You take a step!");
      walk(step - 1); // recursive case
   }

   private static int factorial(int num) {
      if (num < 1) return 1;
      return num * factorial(num - 1);
   }

   private static int power (int base, int exponent) {
      if (exponent < 1) return 1;
      return base * power(base, exponent - 1);
   }
}
