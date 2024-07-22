package exercise1;

public class Course {
    private String courseName;
    private int courseCode;
    private Student[] students = new Student[1000];
    private int count = 0;

    public Course() {
        students = new Student[1000];
    }

    public boolean addStudent(Student student) {
        students[count++] = student;
        return isExist(student);
    }

    public void display() {
        if (students[0] == null)
            System.out.println("Danh sách trống");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].toString());
        }
    }

    public boolean isExist(Student student) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentID() == student.getStudentID()) {
                return true;
            }
        }
        return false;
    }
}