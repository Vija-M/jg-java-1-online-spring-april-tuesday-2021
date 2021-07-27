package students.dmitriy_shukailo.lesson_12.level_1.task_5;

class ExceptionDemo {

    public static void main(String[] args) {


        int num[] = {1, 2, 3, 4};
        System.out.println(num[5]);

        System.out.println(10/0);

        String string = null;
        System.out.println(string.toUpperCase());

        int[] i = new int[1];
        for(int i1 = 0;i1<5;i1++) {
            i[i1] = 4;
        }
    }

}