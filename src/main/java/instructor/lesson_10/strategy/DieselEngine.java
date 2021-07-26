package instructor.lesson_10.strategy;

public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting like a diesel engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping like a diesel engine");
    }
}
