package instructor.lesson_10.strategy;

class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting like a petrol engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping like a petrol engine");
    }
}
