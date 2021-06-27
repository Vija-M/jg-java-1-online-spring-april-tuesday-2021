package students.ernests_subhankulovs.lesson_9.level_2.task_10;

class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    // допишите решение тут
    public ConstructorChaining(String constructorName, int parameterCount) {
        ConstructorChaining constructorChaining = new ConstructorChaining(constructorName);
        constructorChaining.parameterCount = parameterCount;

    }

}
