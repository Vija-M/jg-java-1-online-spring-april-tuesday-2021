package students.ernests_subhankulovs.lesson_10.level_7.task_25;

public class CommuteTest {

    Vehicle airplane = new Airplane();
    Vehicle car = new Car();
    Vehicle ship = new Ship();
    Commute commute = new Commute(airplane);

    public static void main(String[] args) {
        CommuteTest test = new CommuteTest();
        test.carTest();
        test.shipTest();
        test.airplaneTest();
    }

    public void carTest() {
        commute.changeVehicle(car);
        assertTestResult("Gas", commute.startTransportation(), "Start transportation test - Car");
        assertTestResult("Break", commute.endTransportation(), "End transportation test - Car");
    }

    public void shipTest() {
        commute.changeVehicle(ship);
        assertTestResult("Sail off", commute.startTransportation(), "Start transportation test - Ship");
        assertTestResult("Dock", commute.endTransportation(), "End transportation test - Ship");
    }

    public void airplaneTest() {
        commute.changeVehicle(airplane);
        assertTestResult("Take off", commute.startTransportation(), "Start transportation test - Airplane");
        assertTestResult("Land", commute.endTransportation(), "End transportation test - Airplane");
    }

    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Real result: " + realResult);
        }
    }
}
