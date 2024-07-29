package DemoInheritance;

public class Dog extends Animal {
    //example of overriding
    public void makeSound() {
        System.out.println("The dog barks 'woof woof'");

        //example of super
        super.makeSound();
    }

    //example of overloading
    public void makeSound(String sound) {
        System.out.println("The dog can make a " + sound + " sound");
    }
}
