package instructor.lesson_10.strategy;

class ElectricalBatteryEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting like an electrical battery engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping like an electrical battery engine");
    }
}
