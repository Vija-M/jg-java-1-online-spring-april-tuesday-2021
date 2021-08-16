package students.vija_m.lesson_12.level_1.task_5;

class ExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.toUpperCase());
// NullPointerException: Cannot invoke "String.toUpperCase()" because "str" is null

        int[] i = new int[1];
        for ( int j = 0; j < 5; j++ ) {
            i[j] = 4;
// ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1

            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        }

        System.out.println(1 / 0);
//ArithmeticException: / by zero
    }
}
