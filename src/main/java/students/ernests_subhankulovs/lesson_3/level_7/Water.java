package students.ernests_subhankulovs.lesson_3.level_7;

class Water {
    int freezingTemperature;
    int boilingTemperature;

    Water() {
        this.freezingTemperature = 0;
        this.boilingTemperature = 100;
    }

    void freeze() {
        System.out.println("Water is freezing if its temperature is below " + this.freezingTemperature + " degrees.");
    }

    void boil() {
        System.out.println("Water is boiling if its temperature is above " + this.boilingTemperature + " degrees.");
    }
}
