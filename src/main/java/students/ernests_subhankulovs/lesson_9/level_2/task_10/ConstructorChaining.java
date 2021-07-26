package students.ernests_subhankulovs.lesson_9.level_2.task_10;

class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    // допишите решение тут
    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;

    }

}
