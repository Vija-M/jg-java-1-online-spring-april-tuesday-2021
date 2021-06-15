package instructor.lesson_8.inheritance;

class PrinterDemo {

    public static void main(String[] args) {

        System.out.println("-= Laser Printer =-");
        LaserPrinter laserPrinter = new LaserPrinter("Epson", "X1");
        laserPrinter.print();

        System.out.println();
        System.out.println("-= Ink Printer =-");
        InkPrinter inkPrinter = new InkPrinter("Epson", "X2");
        inkPrinter.print();

    }
}
