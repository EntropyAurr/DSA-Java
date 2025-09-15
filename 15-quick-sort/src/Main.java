public class Main {
   public static void main(String[] args) {
      // quick sort = moves smaller elements to the left side of pivot..
      // ..recursively divide the array in 2 partitions

      // run-time complexity = best case O(n log n)
      //                       average case O(n log n)
      //                       worse case O(n^2) if already sorted
      // space complexity = O(n log n) due to recursion

      int[] array = {2, 3, 6, 9, 1, 4, 7, 8, 5};

      quickSort(array, 0, array.length - 1);

      for (int i : array) {
         System.out.print(i + " ");
      }
   }

   private static void quickSort(int[] array, int start, int end) {
      if (end <= start) return; // base case

      int pivotIndex = partition(array, start, end); // find the position of pivot for the next recursion

      quickSort(array, start, pivotIndex - 1); // left partition
      quickSort(array, pivotIndex + 1, end); // right partition
   }

   private static int partition(int[] array, int start, int end) {
      int pivotValue = array[end];
      int i = start - 1;

      // moving elements: (LEFT) elements < pivotValue |pivotValue| elements > pivotValue (RIGHT)
      for (int j = start; j <= end - 1; j++) {
         if (array[j] < pivotValue) {
            i++;
            swap(array, i, j);
         }
      }
      // finish moving elements
      // i always tracks the last index of the LEFT side

      // move the pivot to its correct position
      swap(array, i + 1, end);

      return i + 1;
   }

   private static void swap(int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }
}
