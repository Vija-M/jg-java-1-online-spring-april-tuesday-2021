package students.dmitriy_shukailo.lesson_9.level_2.task_10;

class ConstructorChaining {

    private final String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }

}