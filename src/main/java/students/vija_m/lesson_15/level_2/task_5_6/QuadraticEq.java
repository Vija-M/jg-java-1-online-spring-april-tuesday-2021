package students.vija_m.lesson_15.level_2.task_5_6;

class QuadraticEq {

    public void calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            discriminantGreaterThanZero(a, b, discriminant);
        } else if (discriminant == 0) {
            discriminantEqualsZero(a, b);
        } else {
            discriminantLessThanZero();
        }
    }

    String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    String discriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        return "x = " + x;
    }

    String discriminantLessThanZero() {
        return "Equation has no roots";
    }

}