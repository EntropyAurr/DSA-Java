import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      // binary search = search algorithm that finds the position of a target value within a sorted array
      // half of the array is eliminated during each step

      int[] array = new int[100];
      int target = 72;

      for (int i = 0; i < array.length; i++) {
         array[i] = i;
      }

      // int index = Arrays.binarySearch(array, target);
      int index = binarySearch(array, target);

      if (index == -1) {
         System.out.println(target + " not found");
      } else {
         System.out.println("Element found at index: " + index);
      }
   }

   private static int binarySearch(int[] array, int target) {
      int low = 0;
      int high = array.length - 1;
      int step = 1;

      while (low <= high) {
         int middle = (low + high) / 2;

         System.out.println("Middle: " + middle);
         
         if (array[middle] < target) {
            // search the RIGHT half of the array
            low = middle + 1;
            step++;
         } else if (array[middle] > target) {
            // search the LEFT half of the array
            high = middle - 1;
            step++;
         } else {
            System.out.println("Number of step: " + step);
            return middle; // target found
         }
      }

      return -1; // target not found
   }
}
