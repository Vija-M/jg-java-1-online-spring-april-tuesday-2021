package students.linda_junkina.lesson_15.level_2.task_9;

class Trader {
    String fullName;
    String city;
    String nameOfTheScammer = "Pockemon";
    String cityOfTheScammer = "Sidney";

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }


    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getNameOfTheScammer() {
        return nameOfTheScammer;
    }

    public String getCityOfTheScammer() {
        return cityOfTheScammer;
    }
}

