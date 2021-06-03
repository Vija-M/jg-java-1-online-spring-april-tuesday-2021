package students.jevgenij_leshkevich.lesson_5.level_1.task_8;

// Найдите ошибку в программе и исправить её:

class ArrayLength2 {

    public static void main(String[] args) {
//         int numbers = new int[2];
        int[] numbers = new int[2];

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
//        System.out.println(numbers[2]); - размер массива из 2 значений, допустимо по индексу 0 и 1, индекс 2 за пределами массива
    }

}
