public class Main {
   public static void main(String[] args) {
      // insertion sort = compare elements to the LEFT, then shift elements to the RIGHT to make room..
      // ..to insert a value
      // small data sets = decent
      // large data sets = bad

      // less steps than Bubble Sort
      // best case is O(n) compared to Selection Sort O(n^2)

      int[] array = {8, 2, 6, 1, 4, 3, 0, 9, 5, 7};

      insertionSort(array);

      for (int i : array) {
         System.out.print(i + " ");
      }
   }

   private static void insertionSort(int[] array) {
      for (int i = 1; i < array.length; i++) {
         // start at index 1 for comparing with the left value
         int temp = array[i];
         int j = i -1;

         while (j >= 0 && array[j] > temp) {
            array[j+1] = array[j]; // shift the value at index j to the RIGHT
            j--;
         }

         array[j+1] = temp;
      }
   }
}
