package students.dmitriy_shukailo.lesson_3.level_7.task_26;

class TicketDemo {

    public static void main(String[] args) {

        Ticket ticket = new Ticket("Lids", 25, "7.20");

        ticket.check();
        ticket.changeRout("Manchester");
        ticket.check();
        ticket.changePlace(11);
        ticket.check();
        ticket.changeTime("21.00");
        ticket.check();
    }
}