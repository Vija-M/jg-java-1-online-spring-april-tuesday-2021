package students.jevgenij_leshkevich.lesson_5.level_1.task_7;

// Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
//        int numbers = new int[2];
//        System.out.println(numbers[-1]);

        int[] numbers = new int[2];
        System.out.println(numbers[1]); // начало индекса с 0, отрицательное значение быть не может

    }

}
