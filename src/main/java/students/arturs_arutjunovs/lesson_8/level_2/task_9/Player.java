package students.arturs_arutjunovs.lesson_8.level_2.task_9;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class ComputerPlayer extends Player {

    ComputerPlayer player = new ComputerPlayer("John");

    ComputerPlayer(String name) {
        super(name);
    }
}
