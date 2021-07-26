package instructor.lesson_10.strategy;

class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void replace(Engine engine) {
        this.engine = engine;
    }

    void turnOn() {
        System.out.println("Turning car on..");
        engine.start();
    }

    void turnOff() {
        System.out.println("Turning car off..");
        engine.stop();
    }
}
