package students.linda_junkina.lesson_3.level_2.task_8;

class UserNameDemo {

    public static void main(String[] args) {

        UserName userName = new UserName();
        userName.userName = "Michael";

        UserName greeting = new UserName();
        greeting.greeting = "Hi " + userName.userName + "!";

        System.out.print(greeting.greeting);
    }
}