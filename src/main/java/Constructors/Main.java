package Constructors;

public class Main {
    public static void main(String[] args) {
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(22);
        Animal animalWithTwoParameters = new Animal(23,61);

        System.out.println(animalDefault);
        System.out.println(animalWithOneParameter);
        System.out.println(animalWithTwoParameters);


    }
}
