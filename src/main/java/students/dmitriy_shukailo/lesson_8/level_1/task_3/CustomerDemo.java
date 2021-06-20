package students.dmitriy_shukailo.lesson_8.level_1.task_3;

class CustomerDemo {

    public static void main(String[] args) {

        Customer customer = new Customer();

        System.out.println("Nickname: " + customer.getNickname());
        System.out.println("MessagesCount: " + customer.getMessagesCount());
        System.out.println("IsOnline: " + customer.getIsOnline());
        System.out.println("Moderator: " + customer.getModerator());
    }

}