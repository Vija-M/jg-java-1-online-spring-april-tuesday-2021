package students.ernests_subhankulovs.lesson_15.level_2.task_6;

class QuadraticEq {

    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            String result = discriminantGreaterThanZero(a, b, discriminant);
            System.out.println(result);
            return result;
        }
        else if (discriminant == 0) {
            String  result = "x = " + discriminantEqualsZero(a, b);
            System.out.println(result);
            return result;
        }
        else {
            String result = discriminantLessThanZero();
            System.out.println(result);
            return result;
        }
    }

    public String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        String result = "x1 = " + x1 + ", x2 = " + x2;
        System.out.println(result);
        return result;
    }

    public double discriminantEqualsZero(double a, double b) {
        return -b / (2 * a);
    }

    public String discriminantLessThanZero() {
        return "Equation has no roots";
    }

}
