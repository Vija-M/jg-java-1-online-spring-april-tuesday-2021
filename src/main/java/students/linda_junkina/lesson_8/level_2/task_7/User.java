package students.linda_junkina.lesson_8.level_2.task_7;

class User extends Account {

    public User(String name, String emailAddress) {
        super(name, emailAddress);
    }
}
/*
Если родительский класс имеет конструктор,
дочерний должен иметь конструктор который
будет с ним совпадать.
 */