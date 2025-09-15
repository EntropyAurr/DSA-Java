import java.util.Hashtable;

public class Main {
   public static void main(String[] args) {
      // Hashtable = a data structure that stores unique key-value
      // Each key-value pair is known as an Entry
      // Fast for insertion, look up, deletion of key-value pairs
      // Not ideal for small data sets, great with large data sets

      // hashing = takes a key and computes an integer (formula will vary based on key & data type)
      //          In a Hashtable, we use (hash % capacity) to calculate the index number
      //          key.hashcode() % capacity = index

      // bucket = an indexed storage location for one or more Entries
      //          can store multiple Entries in case of a collision (linked similarly a LinkedList)

      // collision = hash function generates the same index for more than one key
      // less collision = more efficient

      // run-time complexity = best case O(1)
      //                       worse case O(n)

      Hashtable<String, String> table = new Hashtable<>(10);

      table.put("100", "Aurora");
      table.put("123", "Patrick");
      table.put("321", "Sophie");
      table.put("555", "Tom");
      table.put("777", "Alice");

      for (String key: table.keySet()) {
         System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
      }
   }
}
