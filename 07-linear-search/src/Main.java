import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // linear search = iterate through a collection by one element at a time
      // runtime complexity: O(n)

      // Cons: Slow for large data sets

      // Pros:
      // 1. Fast for searches of small-medium data sets
      // 2. Does not need to sorted
      // 3. Useful for data structures that do not have random access (LinkedList)

      Scanner scanner=new Scanner(System.in);

      int[] array = {4, 2, 7, 52, 29, 13, 98};

      System.out.print("Enter the number you want to search: ");
      int number=scanner.nextInt();

      int index = linearSearch(array, number);

      if (index != -1) {
         System.out.println("Found at index: " + index);
      } else {
         System.out.println("Not found");
      }

      scanner.close();
   }

   private static int linearSearch(int[] array, int value) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == value) {
            return i;
         }
      }

      return -1;
   }
}
