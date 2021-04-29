package students.olga_t.lesson_2.level_3.task_10;

class PerimeterAndArea {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Enter number and press Enter
        System.out.println("Введите радиус круга (вещественное число) и нажмите Enter");
        double InputNumber = scanner.nextDouble();

        System.out.println("Вы ввели число " + InputNumber + ". Периметр круга(2 * \u03c0 * r) составляет " + InputNumber *2*3.141592653589793238462643 + ". Площадь круга(\u03c0 * r2) составляет " + 3.141592653589793238462643*InputNumber*InputNumber +".");

    }

}
