package CollectionClasses;

import java.util.HashMap;
import java.util.Map;

/*
HashMap
It is the implementation of the Map interface backed by the hash table. It stores the key-value pairs.
It does not allow null values. It is not synchronized. It never guarantees the insertion order.
It provides constant time performance for methods like get, and put.
Its performance depends on two factors — initial capacity and load factor.
Capacity is the number of buckets in the hash table so the initial capacity is the number of buckets allocated at the time of creation.
Load factor is the measure of how much a hash table can be populated before its capacity is increased.
The rehash method is used to increase the capacity and it mainly doubles the number of buckets.

Key Features of HashMap
1.Implementation: Implements the Map interface using a hash table for storing key-value pairs.
2.Storage: Stores key-value pairs and does not allow duplicate keys.
3.Null Values: Does not allow null keys (since Java 7) and allows at most one null value.
4.Synchronization: Not synchronized; not thread-safe. For thread-safe operations, use Collections.synchronizedMap().
5.Ordering: Does not guarantee the order of key-value pairs. Iteration order may change over time due to rehashing.
6.Performance: Provides constant-time performance (O(1)) for get() and put() operations on average, assuming a good hash function and proper load factor management.
7.Capacity and Load Factor:
(i)Initial Capacity: Number of buckets allocated at the time of creation.
(ii)Load Factor: Measure of how full the hash table can get before its capacity is increased (default load factor is 0.75).
(iii)Rehashing: Doubles the number of buckets when the load factor is exceeded, using the rehash() method.
 */
public class HashMapDemo  {
    public static void main(String[] args) {
        //A HashMap is created to store String keys and Integer values.
        Map<String, Integer> hashMap = new HashMap<>();
        //put() method is used to add key-value pairs to the HashMap.
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        //Print HashMap
        System.out.println("HashMap: " +hashMap);
        //get() method retrieves the value associated with a specified key.
        System.out.println("Value for key \"Three\": " +hashMap.get("Three"));
        //remove() method removes the key-value pair associated with a specified key.
        hashMap.remove("Five");
        System.out.println("HashMap after removing \"Five\": " +hashMap);
        //containsKey() method checks if a specific key exists in the HashMap.
        boolean hashKey = hashMap.containsKey("Two");
        System.out.println("HashMap contains the key \"Two\": " +hashKey);
        //containsValue() method checks if a specific value exists in the HashMap.
        boolean hashValue = hashMap.containsValue(2);
        System.out.println("HashMap contains the value \"2\": "+hashValue);
        //entrySet() method provides a set view of the key-value pairs in the HashMap, which is then iterated over using a for-each loop.
        System.out.println("Iterating over HashMap");
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+ " --> " +entry.getValue());
        }
        //keySet() method returns a set of keys by iterating over the keys of the map
        System.out.println("Iterating over HashMap");
        for(String key : hashMap.keySet()){
            Integer value = hashMap.get(key);
            System.out.println(key + " --> " + value);
        }

    }
}
