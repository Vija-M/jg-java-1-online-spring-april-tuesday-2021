package students.dmitriy_shukailo.lesson_3.level_7.task_26;

class Ticket {

    String ticketRoute;
    int ticketPlace;
    String ticketTime;

    Ticket(String ticketRoute, int ticketPlace, String ticketTime) {
        this.ticketRoute = ticketRoute;
        this.ticketPlace = ticketPlace;
        this.ticketTime = ticketTime;
    }

    void check() {
        System.out.println("Rout  : " + ticketRoute);
        System.out.println("Place : " + ticketPlace);
        System.out.println("Time  : " + ticketTime);
    }

    void changeRout(String newRout) {
        ticketRoute = newRout;
    }

    void changePlace(int newPlace) {
        ticketPlace = newPlace;
    }

    void changeTime(String newTime) {
        ticketTime = newTime;
    }
}