package students.dmitrijs_matrenicevs.lesson_8.level_1.task_3;

class CustomerDemo {

    public static void main(String[] args) {

        Customer customer = new Customer();

        System.out.println(customer.getNickname());
        System.out.println(customer.getMessagesCount());
        System.out.println(customer.isOnline());
        System.out.println(customer.getModerator());
    }

}
