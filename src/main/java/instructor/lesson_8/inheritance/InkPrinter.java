package instructor.lesson_8.inheritance;

class InkPrinter extends Printer {

    int blackCartridgeLevel;
    int cyanCartridgeLevel;
    int magentaCartridgeLevel;
    int yellowCartridgeLevel;

    InkPrinter(String brand, String model) {
        super(brand, model);
    }

    @Override
    boolean canPrint() {
        return super.canPrint() &&
                blackCartridgeLevel > 0 &&
                cyanCartridgeLevel > 0 &&
                magentaCartridgeLevel > 0 &&
                yellowCartridgeLevel > 0;
    }
}
