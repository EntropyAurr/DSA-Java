public class Main {
   public static void main(String[] args) {
      // bubble sort = pairs of adjacent elements are compared
      // and the elements swapped if they're not in order
      // good for small data sets, bad for large data sets

      int[] array = {9, 0, 4, 2, 7, 1, 6, 8, 5};

      bubbleSort(array);

      for (int i : array) {
         System.out.print(i + " ");
      }
   }

   public static void bubbleSort(int[] array) {
      for (int i = 0; i < array.length - 1; i++) {
         for (int j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
               int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
            }
         }
      }
   }
}
