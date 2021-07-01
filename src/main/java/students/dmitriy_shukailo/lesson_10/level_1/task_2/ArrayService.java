package students.dmitriy_shukailo.lesson_10.level_1.task_2;

interface ArrayService {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}