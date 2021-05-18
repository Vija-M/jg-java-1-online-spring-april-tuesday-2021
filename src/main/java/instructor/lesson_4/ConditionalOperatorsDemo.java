package instructor.lesson_4;

class ConditionalOperatorsDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        boolean areEqual = a == b; // false
        boolean areNotEqual = a != b; // true
        boolean isGreaterThan = a > b; // false
        boolean isGreaterThanOrEqual = a >= b; // false
        boolean isLesserThan = a < b; // true
        boolean isLesserThanOrEqual = a <= b; // true

        System.out.println("areEqual             = " + areEqual);
        System.out.println("areNotEqual          = " + areNotEqual);
        System.out.println("isGreaterThan        = " + isGreaterThan);
        System.out.println("isGreaterThanOrEqual = " + isGreaterThanOrEqual);
        System.out.println("isLesserThan         = " + isLesserThan);
        System.out.println("isLesserThanOrEqual  = " + isLesserThanOrEqual);

        if (a == b) {
            // do this
        }

    }
}
