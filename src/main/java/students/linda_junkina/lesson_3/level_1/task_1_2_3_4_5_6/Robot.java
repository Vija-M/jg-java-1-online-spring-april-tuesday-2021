package students.linda_junkina.lesson_3.level_1.task_1_2_3_4_5_6;

class Robot {

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is ROBO!");
    }


    String greeting;
    String name;

    Robot() {
    }

    Robot(String greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }
    void printInfo() {
        System.out.println(this.greeting + ", " + this.name);
    }


}

