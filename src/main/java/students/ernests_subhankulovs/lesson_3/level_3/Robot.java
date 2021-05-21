package students.ernests_subhankulovs.lesson_3.level_3;

class Robot {

    String name;

    public Robot() {

    }

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
