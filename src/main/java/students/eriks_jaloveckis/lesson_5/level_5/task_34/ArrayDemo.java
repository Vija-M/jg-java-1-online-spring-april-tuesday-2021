package students.eriks_jaloveckis.lesson_5.level_5.task_34;

class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.createDemoArray();

    }

    public void createDemoArray() {
        Array array = new Array();
        int[] demoArray = array.create(5);
        array.fillRandomly(demoArray);
        array.print(demoArray);

    }
}

