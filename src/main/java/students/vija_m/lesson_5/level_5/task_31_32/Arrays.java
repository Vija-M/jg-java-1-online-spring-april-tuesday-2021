package students.vija_m.lesson_5.level_5.task_31_32;

class Arrays {
    int getArrayLength;

    public Arrays(int getArrayLength) {
        this.getArrayLength = getArrayLength;
    }

    void getArrayLength() {
        int array[] = new int[getArrayLength];
        System.out.println(array.length);
    }
}

