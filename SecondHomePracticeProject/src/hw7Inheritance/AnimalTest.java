package hw7Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();
        Cobra cobra = new Cobra();
        Robin robin = new Robin();

        // Direct method calls
        bullDog.bullDogInfo();
        cobra.cobraInfo();
        robin.robinInfo();

        // Inherited method calls
        bullDog.dogInfo();       // From Dog
        bullDog.mammalInfo();    // From Mammal
        bullDog.animalInfo();    // From Animal

        cobra.snakeInfo();       // From Snake
        cobra.reptileInfo();     // From Reptile
        cobra.animalInfo();      // From Animal

        robin.birdsInfo();       // From Birds
        robin.animalInfo();      // From Animal

        // Hierarchical Inheritance example: Multiple subclasses of Animal
        Dog dog = new Dog();
        Snake snake = new Snake();
        Birds birds = new Birds();

        dog.animalInfo();
        snake.animalInfo();
        birds.animalInfo();
    }
}
