public class Main {
   public static void main(String[] args) {
      // Advantages
      // 1. Random access of elements - O(1)
      // 2. Good locality of reference and data cache utilization
      // 3. Easy to insert/delete at the end

      DynamicArray dynamicArray = new DynamicArray(5);

      dynamicArray.add("A");
      dynamicArray.add("B");
      dynamicArray.add("C");
      dynamicArray.add("D");
      dynamicArray.add("F");

      dynamicArray.insert(0, "X");
      dynamicArray.delete("A");

      // shrink
      dynamicArray.delete("B");
      dynamicArray.delete("C");

      System.out.println(dynamicArray);
      System.out.println("Size: " + dynamicArray.size);
      System.out.println("Capacity: " + dynamicArray.capacity);
      System.out.println("Empty: " + dynamicArray.isEmpty());
      System.out.println("Search: " + dynamicArray.search("M"));

   }
}
