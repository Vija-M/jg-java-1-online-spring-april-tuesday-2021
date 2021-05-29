package students.ernests_subhankulovs.lesson_5.level_1.task_1;

class ArrayDefinition1 {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        //Demo
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println("i = " + i + "; numbers[i] = " + numbers[i]);
        }

    }

}
