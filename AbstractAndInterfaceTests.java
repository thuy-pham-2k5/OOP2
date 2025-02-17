import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import animal.Cat;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());
//            if (animal instanceof Chicken) {
//                Edible edibler = (Chicken) animal;
//                System.out.println(edibler.howtoEat());
//            }
//        }

        Animal[] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                Edible edibler =(Cat) animal;
                System.out.println(edibler.howtoEat());
            }
        }
    }
}
