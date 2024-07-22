package exercise1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 18, 2300667);
        Student student2 = new Student("Lan", 21, 2300345);
//        System.out.println("Decribe student information:");
//        System.out.println(student1.toString());
//        System.out.println(student2.toString());

        Course course1 = new Course();
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.display();

    }
}
