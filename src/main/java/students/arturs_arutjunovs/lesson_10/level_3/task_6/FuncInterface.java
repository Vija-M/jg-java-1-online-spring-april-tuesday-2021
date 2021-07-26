package students.arturs_arutjunovs.lesson_10.level_3.task_6;

//Функциональный интерфейс считается таковым, если содержит один абстрактный (не реализованный) метод.
//А аннотация @FuncInterface должна сообщать компилятору что данный интерфейс является функциональным
//и не допустит более одного абстрактного метода. Можно так же использовать дефолтные и статические методы.
//Часто используются в лямбда выражениях.

@FunctionalInterface
interface FuncInterface {

    boolean isTrue();

    static boolean isFalse() {
        return true;
    }
}
