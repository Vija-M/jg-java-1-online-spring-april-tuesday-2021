package students.dmitriy_shukailo.lesson_3.level_7.task_26;

class TVDemo {

    public static void main(String[] args) {

        TV tv = new TV("Sony", 50, true, true, 2500);

        tv.buyTV();
        tv.changeTV("Horizont", 24, false, false, 100);
        tv.buyTV();
    }
}
