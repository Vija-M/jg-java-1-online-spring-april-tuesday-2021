package students.antons_korenevskis.lesson_3.level_1;


class Robot{


    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello!");
    }
    void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public static void main(String[] args) {

    }

}

