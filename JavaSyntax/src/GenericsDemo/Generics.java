package GenericsDemo;
/*
Generics in Java allow you to define classes, interfaces, and methods with a placeholder for
the type they operate on, which provides type safety and eliminates the need for type casting.

The type parameters used to create generic classes in Java are not actual data types like int, String, or double.
Instead, they are placeholders for the types that will be specified when an instance of the generic class is created.
These placeholders allow the class to be flexible and work with any data type specified by the user.

Key Features of Generics:
1.Type Safety: Ensures that you can only use the intended type, reducing runtime errors.
2.Elimination of Type Casting: With generics, explicit type casting is not required, making code cleaner and easier to read.
3.Compile-Time Checking: Errors are caught at compile-time rather than at runtime, making debugging easier.
4.Code Reusability: Enables the creation of more general and reusable code.
5.Generics and Inheritance: Generics work with inheritance and subtyping, allowing you to use polymorphism with generic types.
6.Type Parameters Are Placeholders: Type parameters like T, E, K, V, etc., are placeholders that
will be replaced with actual data types when the generic class is instantiated.
 */
public class Generics {
    public static void main(String[] args) {
        //Create a box for string type
        Box<String> nameBox = new Box<>();
        nameBox.setT("Godfrey Okoth Ouma");
        String strValue = nameBox.getT();//No casting needed
        System.out.println("My name is " +strValue+ ".");

        //Create a box for integer
        Box<Integer> ageBox = new Box<>();
        ageBox.setT(34);
        Integer intValue = ageBox.getT();//No casting needed
        System.out.println("I am " +intValue+ " year old.");

        //Create a pair of string and integer
        Pair<String, Integer> independence = new Pair<>();
        independence.setK("Kenya");
        independence.setV(1963);
        String key = independence.getK();//No casting needed
        Integer value = independence.getV();//No casting needed
        System.out.println(key+ " got independence in " +value+ ".");
    }
    //Generic class with one type parameter
    public static class Box<T>{
        private T t;

        public Box() {
        }

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }
    //Generic class with two type parameter
    public static class Pair<K, V>{
        private K k;
        private V v;
        public Pair() {
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }
    }
}
