package students.vija_m.lesson_7.level_7.task_12;

class Encapsulation {
    private int age;
    private final String name;

    Encapsulation(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    private void newLetter() {

    }
}

/*Инкапсуляция - это возможность объединять свойства и логику (методы) в одном в самодостаточном классе.
Благодаря этому мы можем частично изолировать эту логику, контролировать доступ к видимости элементов и область видимости.
Как следствие - контроль сохранения данных.
 */
