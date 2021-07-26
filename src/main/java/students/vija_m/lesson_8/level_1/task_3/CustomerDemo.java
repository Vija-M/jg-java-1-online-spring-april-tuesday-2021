package students.vija_m.lesson_8.level_1.task_3;

class CustomerDemo {

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("customer.getNickname() value = " + customer.getNickname());
        System.out.println("customer.getMessagesCount() value = " + customer.getMessagesCount());
        System.out.println("customer.getIsOnline() value = " + customer.getIsOnline());
        System.out.println("customer.getIsModerator() value = " + customer.getIsModerator());
    }
}
