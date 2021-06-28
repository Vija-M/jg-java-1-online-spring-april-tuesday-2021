package students.arturs_arutjunovs.lesson_9.level_2.task_11;

class Laptop extends Computer {

    private String laptopName;

    public Laptop(String laptopName) {
        super("Dell", 24, 500);
        this.laptopName = laptopName;
    }

    public Laptop(String monitorName, int monitorSize, int ssdVolume, String laptopName) {
        super(monitorName, monitorSize, ssdVolume);
        this.laptopName = laptopName;
    }
}
