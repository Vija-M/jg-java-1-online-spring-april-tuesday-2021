package students.ernests_subhankulovs.lesson_8.level_1.task_3;

class CustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("\"nickname\" default value: " + customer.getNickname());
        System.out.println("\"messagesCount\" default value: " + customer.getMessagesCount());
        System.out.println("\"isOnline\" default value: " + customer.getIsOnline());
        System.out.println("\"isModerator\" default value: " + customer.getIsModerator());
    }
}
