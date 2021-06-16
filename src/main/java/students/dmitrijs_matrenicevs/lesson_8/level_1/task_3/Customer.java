package students.dmitrijs_matrenicevs.lesson_8.level_1.task_3;

class Customer {

    private String nickname;
    private int messagesCount;
    private boolean isOnline;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMessagesCount() {
        return messagesCount;
    }

    public void setMessagesCount(int messagesCount) {
        this.messagesCount = messagesCount;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public Boolean getModerator() {
        return isModerator;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    private Boolean isModerator;

    void PrintInfo(){
        System.out.println(getNickname());
        System.out.println(nickname);
        System.out.println(getMessagesCount());
        System.out.println(messagesCount);
        System.out.println(isOnline);
        System.out.println(isModerator);

    }


}
