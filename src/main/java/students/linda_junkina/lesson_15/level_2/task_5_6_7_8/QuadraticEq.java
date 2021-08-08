package students.linda_junkina.lesson_15.level_2.task_5_6_7_8;

class QuadraticEq {

    private String discriminantGreaterThan0(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private String discriminantEquals0(double a, double b) {
        double x = -b / (2 * a);
        return "x = " + x;
    }

    private String discriminantLessThan0() {
        return "Equation has no roots";
    }

    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return discriminantGreaterThan0(a, b, discriminant);
        } else if (discriminant == 0) {
            return discriminantEquals0(a, b);
        } else {
            return discriminantLessThan0();
        }
    }
}
