import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 3, "Labrador Retriever"),
                new Cat("Smokey", 5, 9),
                new Dog("Max", 2, "German Shepherd"),
                new Cat("Quiet", 1, 5)
        };
        System.out.println("");
        System.out.println("              ANIMALS               ");
        System.out.println("");
        for (Animal animal : animals) {
            System.out.println(animal);

            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                System.out.println(" Doesn't make a sound ");
            }

            System.out.println();
        }
    }
}