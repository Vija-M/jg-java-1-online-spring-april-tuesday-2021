package students.dmitrijs_matrenicevs.lesson_8.level_1.task_3;

class Customer {

    private String nickname;
    private int messagesCount;
    private boolean isOnline;
    private Boolean isModerator;

    public String getNickname() {
        return nickname;
    }

    public int getMessagesCount() {
        return messagesCount;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public boolean getModerator() {
        return isModerator;
    }

    void camelCase() {
        System.out.println(nickname);
        System.out.println(messagesCount);
        System.out.println(isOnline);
        System.out.println(isModerator);
    }


}
