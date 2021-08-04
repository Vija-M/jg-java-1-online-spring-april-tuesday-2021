package students.vija_m.lesson_7.level_6.task_10;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int outLength = 0;
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                outLength++;
            }
        }

        int[] out = new int[outLength];
        int j = 0;
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                out[j] = i;
                j++;
            }
        }
        return out;
    }
}
