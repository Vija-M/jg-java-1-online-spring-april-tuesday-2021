package students.ernests_subhankulovs.lesson_15.level_2.task_6;

class QuadraticEq {

    public void calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            System.out.println(discriminantGreaterThanZero(a, b, discriminant));
        }
        else if (discriminant == 0) {
            System.out.println("x = " + discriminantEqualsZero(a, b));
        }
        else {
            System.out.println(discriminantLessThanZero());
        }
    }

    public String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    public double discriminantEqualsZero(double a, double b) {
        return -b / (2 * a);
    }

    public String discriminantLessThanZero() {
        return "Equation has no roots";
    }

}
