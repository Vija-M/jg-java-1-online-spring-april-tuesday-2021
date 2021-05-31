package students.eriks_jaloveckis.lesson_5.level_4.task_27;
import java.util.Random;
import java.util.Arrays;
class Task27 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(200);
        }
            System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int i = 1; i < array.length; i++ ){
            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println("Max is - " + max);


    }
}

