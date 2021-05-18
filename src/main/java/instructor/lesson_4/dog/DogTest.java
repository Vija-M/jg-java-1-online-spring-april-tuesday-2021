package instructor.lesson_4.dog;

class DogTest {

    public static void main(String[] args) {
        DogTest testRunner = new DogTest();
        testRunner.scenario1();
    }

    void scenario1() {
        Dog subject = new Dog("Brown");

        String expected = "Yellow";

        subject.changeColor("Yellow");

        String actual = subject.color;

        if (expected.equals(actual)) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[FAIL]");
        }
    }
}
