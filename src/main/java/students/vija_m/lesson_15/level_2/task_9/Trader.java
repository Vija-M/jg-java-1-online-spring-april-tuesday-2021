package students.vija_m.lesson_15.level_2.task_9;

class Trader {
    private String name;
    private String city;

    private Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getFullName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
