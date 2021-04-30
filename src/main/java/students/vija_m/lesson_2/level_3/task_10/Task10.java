package students.vija_m.lesson_2.level_3.task_10;

class Task10 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Пожалуйста, введите радиус круга (вещественное число) с целью вычисления периметра и площади круга: ");
        double a = scanner.nextDouble();

        System.out.println("Периметр круга с радиусом " + a + " = " + (2 * 3.1415926535 * a) + ";");
        System.out.println("Площадь круга с радиусом " + a + " = " + (3.1415926535 * a * a) + ".");


    }
}
