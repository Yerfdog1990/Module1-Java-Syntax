package CollectionClasses;
/*
In Java, the hashCode() and equals() methods are fundamental to the functioning of hash-based collections like HashMap, HashSet, and Hashtable. These methods are used to compare objects and determine their storage location in a hash table.
hashCode() Method
The hashCode() method returns an integer representation of the object. This integer, known as the hash code, is used by the hash-based collections to efficiently store and retrieve objects. The general contract of hashCode() is:
If two objects are equal according to the equals(Object) method, then calling hashCode() on each of the two objects must produce the same integer result.
If two objects are unequal according to the equals(Object) method, it is not required that calling hashCode() on each of the two objects must produce distinct integer results. However, producing distinct results can improve the performance of hash-based collections.
equals() Method
The equals() method is used to compare two objects for equality. The general contract of equals() is:
1.It is reflexive: for any non-null reference value x, x.equals(x) should return true.
2.It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
3.It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
4.It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
For any non-null reference value x, x.equals(null) should return false.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

    class hashCodeAndEquals {
        private String name;
        private int age;

        public hashCodeAndEquals(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true; // Check if the objects are the same instance
            if (o == null || getClass() != o.getClass()) return false; // Check for null and class type
            hashCodeAndEquals person = (hashCodeAndEquals) o; // Cast the object to Person
            return age == person.age && Objects.equals(name, person.name); // Check if the fields are equal
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age); // Compute hash code using name and age
        }

        @Override
        public String toString() {
            return name + " (" + age + ")"; // Return string representation of the object
        }
    }

    class HashMapExample {
        public static void main(String[] args) {
            // Create a HashMap to store Person objects as keys and String values
            Map<hashCodeAndEquals, String> personMap = new HashMap<>();

            // Create Person objects
            hashCodeAndEquals p1 = new hashCodeAndEquals("Alice", 30);
            hashCodeAndEquals p2 = new hashCodeAndEquals("Bob", 25);
            hashCodeAndEquals p3 = new hashCodeAndEquals("Alice", 30); // Same as p1

            // Put Person objects into the HashMap
            personMap.put(p1, "Developer");
            personMap.put(p2, "Designer");

            // Try to put p3 into the map and see if it overwrites p1
            personMap.put(p3, "Manager");

            // Print the map
            for (Map.Entry<hashCodeAndEquals, String> entry : personMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

