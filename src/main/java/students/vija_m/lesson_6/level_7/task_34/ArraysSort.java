package students.vija_m.lesson_6.level_7.task_34;

//import org.apache.commons.lang.ArrayUtils;
import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 186, -5, 0, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //ArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
// Метод Arrays.sort() позволяет сортировать элементы массива по возрастанию.
