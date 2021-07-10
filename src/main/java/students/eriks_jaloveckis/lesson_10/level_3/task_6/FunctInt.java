package students.eriks_jaloveckis.lesson_10.level_3.task_6;

@FunctionalInterface
interface FunctInt<T> {
    void searchValue (T t);
}

// имеется только 1 абсктратный метод, !НО также может содержать метода Object класса.
// чаще всего используется в лямбда вырожениях
// можно использовать static и default
// @FunctionalInterface - не позволит код компилироваться, если будет больше или меньше 1 абстрактного метода