public class Main {
   public static void main(String[] args) {
      // selection sort = search through an array & keep track of the minimum value during each iteration
      // At the end of each iteration, swap the variables
      // good for small data sets, bad for large data sets

      int[] array = {2, 0, 7, 1, 8, 4, 3, 9, 6, 5};

      selectionSort(array);

      for (int i : array) {
         System.out.print(i + " ");
      }
   }

   private static void selectionSort(int[] array) {
      for (int i = 0; i < array.length - 1; i++) {
         int min = i;

         for (int j = i + 1; j < array.length; j++) {
            if (array[min] > array[j]) {
               min = j;
            }
         }

         int temp = array[i];
         array[i] = array[min];
         array[min] = temp;
      }
   }
}
