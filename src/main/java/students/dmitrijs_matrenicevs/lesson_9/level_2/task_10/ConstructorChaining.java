package students.dmitrijs_matrenicevs.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;
    public String name;
    public String city;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String name, String city) {
        this(name);
        this.city = city;
    }
}
