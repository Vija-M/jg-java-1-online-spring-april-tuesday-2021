package students.jevgenij_leshkevich.lesson_3.level_3;

class Robot {
    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.print("Hello! ");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name + "!");
        System.out.println();
    }

}
