package students.dmitriy_shukailo.lesson_5.level_6.task_35;

public class ArraysDemo {

    public static void main(String[] args) {

        ArraysDemo demo = new ArraysDemo();
        demo.shouldCreateArray();
    }

    public void shouldCreateArray() {
        Arrays arrays = new Arrays();

        int[] array = arrays.create(10);
        arrays.fillRandomly(array);
        arrays.print(array);
        arrays.findMax(array);
    }

}