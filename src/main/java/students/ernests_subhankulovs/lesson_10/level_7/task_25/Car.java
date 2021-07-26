package students.ernests_subhankulovs.lesson_10.level_7.task_25;

class Car implements Vehicle {
    @Override
    public String start() {
        return "Gas";
    }

    @Override
    public String stop() {
        return "Break";
    }
}
