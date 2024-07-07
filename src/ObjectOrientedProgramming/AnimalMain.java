package ObjectOrientedProgramming;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dogObj = new Dog("Ford", "German Shephard");
        dogObj.display();
        dogObj.isGermanShephard();
        System.out.println();
        dogObj.setName("Mfalme");
        dogObj.setBreed("Siberian Husky");
        dogObj.display();
        dogObj.isSiberianHusky();


    }
}
