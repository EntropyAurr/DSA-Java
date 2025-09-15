public class Main {
   public static void main(String[] args) {
      // merge sort = recursively divide original array in 2 halves..
      // ..recursively sorting them & merging them back together to obtain the sorted array
      // run-time complexity = O(n log n)
      // space-time complexity = O(n)

      int[] array = {8, 5, 0, 4, 1, 9, 2, 7, 3, 6};

      mergeSort(array);

      for (int j : array) {
         System.out.print(j + " ");
      }
   }

   private static void mergeSort(int[] array) {
      int length  = array.length;
      int middle = length / 2;

      if (length <= 1) return; // base case

      int[] leftArray = new int[middle];
      int[] rightArray = new int[length - middle];

      int i = 0; // left array
      int j = 0; // right array

      // copy data to 2 subarrays
      for ( ; i < length; i++) {
         if (i < middle) {
            leftArray[i] = array[i];
         } else {
            rightArray[j] = array[i];
            j++;
         }
      }

      // recursively divide until it meets the base case to stop
      // left side will start first, rightArray below is the right side element of the last recursion..
      // ..therefore in fact it's the element of the left side
      mergeSort(leftArray);
      mergeSort(rightArray);
      merge(leftArray, rightArray, array);
   }

   private static void merge(int[] leftArray, int[] rightArray, int[] array) {
      int leftSize = array.length / 2;
      int rightSize = array.length - leftSize;
      int i = 0; // original array
      int l = 0; // left array
      int r = 0; // right array

      // check the conditions for merging
      while (l < leftSize && r < rightSize) {
         if (leftArray[l] < rightArray[r]) {
            array[i] = leftArray[l];
            i++;
            l++;
         } else {
            array[i] = rightArray[r];
            i++;
            r++;
         }
      }

      // copy remaining elements of left array if any
      while (l < leftSize) {
         array[i] = leftArray[l];
         i++;
         l++;
      }

      // copy remaining elements of right array if any
      while (r < rightSize) {
         array[i] = rightArray[r];
         i++;
         r++;
      }
   }
}
