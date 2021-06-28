package students.ernests_subhankulovs.lesson_9.level_5.task_25;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}