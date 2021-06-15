package students.ernests_subhankulovs.lesson_7.level_6.task_10;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] input = {1, 5, 10, 15, 20, 25};
        System.out.println(Arrays.toString(arrayCopy.copyInRange(input, 10, 20)));
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int outArrayLength = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                outArrayLength++;
            }
        }
        int[] out = new int[outArrayLength];
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                out[j] = in[i];
                j++;
            }
        }
        return out;
    }

}
