package students.ernests_subhankulovs.lesson_10.level_7.task_25;

class Ship implements Vehicle {
    @Override
    public String start() {
        return "Sail off";
    }

    @Override
    public String stop() {
        return "Dock";
    }
}
