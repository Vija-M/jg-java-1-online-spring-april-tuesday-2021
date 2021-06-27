package students.arturs_arutjunovs.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;


    }

}


