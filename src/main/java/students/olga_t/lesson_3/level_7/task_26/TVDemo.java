package students.olga_t.lesson_3.level_7.task_26;

class TVDemo {
    public static void main(String[] args) {
        TV tv1 = new TV("Samsung");

        tv1.showTV();
        System.out.println("Turning TV on.");

        tv1.turnOn(12);

        tv1.showTV();
    }
}
