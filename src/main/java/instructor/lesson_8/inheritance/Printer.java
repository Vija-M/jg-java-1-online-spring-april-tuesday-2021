package instructor.lesson_8.inheritance;

public class Printer {

    boolean powerOn;

    private String brand;
    private String model;

    public Printer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    int powerWatts;

    int paperCount;
    int speed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    void print() {
        System.out.println("Vzhh vzhh");
    }

    boolean canPrint() {
        return isPowerOn() && paperCount > 0;
    }

    final boolean isPowerOn() {
        return powerOn;
    }

    private void foo() {

    }

}
