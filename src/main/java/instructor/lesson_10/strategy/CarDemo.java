package instructor.lesson_10.strategy;

class CarDemo {

    public static void main(String[] args) {

        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();
        Engine electricalBatteryEngine = new ElectricalBatteryEngine();

        Car car = new Car(petrolEngine);

        car.turnOn();
        car.turnOff();

        System.out.println();
        System.out.println("Replacing to Diesel");
        car.replace(dieselEngine);
        car.turnOn();
        car.turnOff();

        System.out.println();
        System.out.println("Replacing to Electrical Battery");
        car.replace(electricalBatteryEngine);
        car.turnOn();
        car.turnOff();

    }
}
