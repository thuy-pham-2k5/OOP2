package DemoInheritance;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        dog1.makeSound();
        Dog dog2 = new Dog();
        dog2.makeSound("'woof'");
    }
}
