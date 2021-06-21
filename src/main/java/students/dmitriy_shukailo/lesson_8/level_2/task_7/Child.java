package students.dmitriy_shukailo.lesson_8.level_2.task_7;

public class Child extends Mother {

    String gender;

    public Child(String nameChild, int ageChild, String gender) {
        super(nameChild, ageChild);
        this.gender = gender;
    }

}

/*
При создании объекта подкласса конструктор родительского класса
вызывается ключевым словом super() и оно должно стоять в
конструкторе первым, затем - переменные подкласса.
 */