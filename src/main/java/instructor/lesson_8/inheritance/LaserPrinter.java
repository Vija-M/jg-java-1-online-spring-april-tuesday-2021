package instructor.lesson_8.inheritance;

class LaserPrinter extends Printer {

    int tonerLevel;

    LaserPrinter() {
        super("PRINTER", "MODEL-1");
    }

    LaserPrinter(String brand, String model) {
        super(brand, model);
    }

    @Override
    void print() {
        System.out.println(getBrand());
        System.out.println(this.getModel());
        System.out.println("Print like a laser printer");
    }

    @Override
    boolean canPrint() {
        return super.canPrint() && tonerLevel > 0;
    }
}
