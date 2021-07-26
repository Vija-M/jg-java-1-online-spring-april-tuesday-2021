package students.linda_junkina.lesson_10.level_1.task_3;

interface SimpleList<T> {
    // добавить элемент на место с указанным индексом
    void addElement(int i, T element);

    // удалить элемент с указанным индексом
    void deleteElement(int i);

    // изменить элемент с указанным индексом
    void changeElement(T element, int i);

    // поменять элементы местами
    void switchElements(T element, int i);
}
