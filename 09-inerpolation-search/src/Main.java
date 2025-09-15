public class Main {
   public static void main(String[] args) {
      // interpolation search = improvement over binary search, best used for "uniformly" distributed data
      // guesses where a value might be based on calculated probe results
      // if the probe is incorrect, search area is narrowed, and a new probe is calculated
      // average case: O(log(log(n))
      // worst case: O(n) [values increase exponentially]

      int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

      int index = interpolationSearch(array, 256);

      if (index != -1) {
         System.out.println("Element found at index: " + index);
      } else {
         System.out.println("Element not found");
      }
   }

   private static int interpolationSearch(int[] array, int value) {
      int low = 0;
      int high = array.length - 1;
      int step = 1;

      while (value >= array[low] && value <= array[high] && low < high) {
         int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

         System.out.println("Probe: " + probe);

         if (array[probe] < value) {
            // search the RIGHT half of the sub array
            low = probe + 1;
            step++;
         } else if (array[probe] > value) {
            // search the LEFT half of the sub array
            high = probe - 1;
            step++;
         } else {
            System.out.println("Number of step: " + step);
            return probe; // target found
         }
      }

      return -1; // target not found
   }
}
