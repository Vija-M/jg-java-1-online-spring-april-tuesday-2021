package students.olga_t.lesson_3.level_7.task_26;

class TV {
    boolean tvOn;
    int chanelNumber;
    String brand;

    TV(String brand) {
        this.brand = brand;
        this.tvOn = false;
    }

    void showTV() {
        System.out.println("brand: " + this.brand);
        if (this.tvOn) {
            System.out.println("TV is on, chanel " + this.chanelNumber);
        }
    }

    void turnOn(int chanelNumber) {
        this.tvOn = true;
        this.chanelNumber = chanelNumber;
    }
}
