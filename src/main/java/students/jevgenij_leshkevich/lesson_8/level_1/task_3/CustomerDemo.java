package students.jevgenij_leshkevich.lesson_8.level_1.task_3;

class CustomerDemo {

    public static void main(String[] args) {

        Customer user = new Customer();

        System.out.println("nickname - " + user.getNickname());
        System.out.println("messagesCount - " + user.getMessagesCount());
        System.out.println("isOnline - " + user.isOnline());
        System.out.println("isModerator - " + user.getModerator());

    }

/*
nickname - null
messagesCount - 0
isOnline - false
isModerator - null
 */

}
