package students.ernests_subhankulovs.lesson_10.level_7.task_25;

class Airplane implements Vehicle {
    @Override
    public String start() {
        return "Take off";
    }

    @Override
    public String stop() {
        return "Land";
    }
}
