public class DynamicArray {
   int size;
   int capacity = 10;
   Object[] array;

   public DynamicArray() {
      this.array = new Object[capacity];
   }

   public DynamicArray(int capacity) {
      this.capacity = capacity;
      this.array = new Object[capacity];
   }

   public void add(Object data) {
      if (size >= capacity) {
         grow();
      }

      array[size] = data; // add data to the end
      size++;
   }

   public void insert(int index, Object data) {
      if (size >= capacity) {
         grow();
      }

      for (int i = size; i > index; i--) {
         array[i] = array[i - 1]; // shift elements over to the RIGHT to make room for the insertion
      }

      array[index] = data; // add data at the index
      size++;
   }

   public void delete( Object data) {
      for (int i = 0; i < size; i++) {
         if (array[i] == data) {
            for (int j = 0; j < size - i - 1; j++) {
               // j < size - i - 1 <=> i + j < size -1
               // i + j: position from the removed element (i) to the RIGHT side that elements will move in
               array[i + j] = array[i + j + 1]; // shift elements over to the LEFT after removing element
            }

            array[size - 1] = null;
            size--;

            if (size <= (int) (capacity / 3)) {
               shrink();
            }
            break;
         }
      }
   }

   public int search(Object data) {
      for (int i = 0; i < size; i++) {
         if (array[i] == data) {
            return i;
         }
      }

      return -1;
   }

   private void grow() {
      int newCapacity = (int) capacity * 2;
      Object[] newArray = new Object[newCapacity];

      for (int i = 0; i < size; i++) {
         newArray[i] = array[i];
      }

      capacity = newCapacity;
      array = newArray;
   }

   private void shrink() {
      int newCapacity = (int) capacity / 2;
      Object[] newArray = new Object[newCapacity];

      for (int i = 0; i < size; i++) {
         newArray[i] = array[i];
      }

      capacity = newCapacity;
      array = newArray;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   public String toString() {
      String string = "";
      for (int i = 0; i < capacity; i++) {
         string += array[i] + ", ";
      }

      if (string != "") {
         string = "[" + string.substring(0, string.length() - 2) + "]";
      } else {
         string = "[]";
      }

      return string;
   }
}
