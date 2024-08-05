package people;

class StudentImpl extends People implements Student {
    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {}

    @Override
    public void sleep() {}

    @Override
    public void registerCourse(String course) {}

    @Override
    public void attendClass() {}

}
