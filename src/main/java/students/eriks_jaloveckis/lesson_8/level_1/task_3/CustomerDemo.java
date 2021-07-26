package students.eriks_jaloveckis.lesson_8.level_1.task_3;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println(customer.getNickname());
        System.out.println(customer.getModerator());
        System.out.println(customer.getMessagesCount());
        System.out.println(customer.isOnline());
    }
}
