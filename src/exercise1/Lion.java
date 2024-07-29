package DemoAbstract;

public class Lion extends Animal {
    protected Lion(String name, String food) {
        super(name, food);
    }
    public void makeSound() {
        System.out.println("Lions growl when in conflict with other lions");
    };
    public void eat() {
        System.out.println("Lions eat meat");
    };
    public void sleep() {
        System.out.println("Lions sleep an average of 16 to 20 hours a day");
    };
}
