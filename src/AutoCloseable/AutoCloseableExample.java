package AutoCloseable;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try(MyResource myResource = new MyResource()){
            myResource.doSomething();
        }catch (Exception e){
            System.out.println("Exception caught: " +e.getMessage());
        }
    }
}
