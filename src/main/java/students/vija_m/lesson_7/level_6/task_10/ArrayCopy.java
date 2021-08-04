package students.vija_m.lesson_7.level_6.task_10;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int outLength = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                outLength++;
            }
        }

        int[] out = new int[outLength];
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
