package students.dmitriy_shukailo.lesson_15.level_2.task_9;

class Trader {

    private final String name;
    private final String city;

    Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    String getFullName() {
        return name;
    }

    String getCity() {
        return city;
    }

}