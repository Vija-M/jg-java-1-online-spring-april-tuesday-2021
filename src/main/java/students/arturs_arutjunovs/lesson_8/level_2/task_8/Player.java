package students.arturs_arutjunovs.lesson_8.level_2.task_8;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }
}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }
}
