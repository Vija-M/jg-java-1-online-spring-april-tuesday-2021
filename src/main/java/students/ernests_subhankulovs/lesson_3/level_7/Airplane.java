package students.ernests_subhankulovs.lesson_3.level_7;

class Airplane {
    String departureAirport;
    String arrivalAirport;

    Airplane(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    void takeOff() {
        System.out.println("The plane has departed from " + this.departureAirport + ".");
    }

    void fly() {
        System.out.println("The plane is flying from " + this.departureAirport + " to " + this.arrivalAirport + ".");
    }

    void land() {
        System.out.println("The plane has landed in " + this.arrivalAirport + ".");
    }
}
