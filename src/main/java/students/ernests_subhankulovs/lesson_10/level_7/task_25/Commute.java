package students.ernests_subhankulovs.lesson_10.level_7.task_25;

class Commute {
    private Vehicle vehicle;

    public Commute(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    String  startTransportation() {
        System.out.println("Starting journey.");
        System.out.println(vehicle.start());
        return vehicle.start();
    }

    String endTransportation() {
        System.out.println("Ending journey.");
        System.out.println(vehicle.stop());
        return vehicle.stop();
    }
}
