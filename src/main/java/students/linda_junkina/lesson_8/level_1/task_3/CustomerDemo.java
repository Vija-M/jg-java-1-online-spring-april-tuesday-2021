package students.linda_junkina.lesson_8.level_1.task_3;

class CustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("customer.getNickname() = " + customer.getNickname());
        System.out.println("customer.getMessagesCount() = " + customer.getMessagesCount());
        System.out.println("customer.getOnline() = " + customer.getOnline());
        System.out.println("customer.getModerator() = " + customer.getModerator());
    }
}