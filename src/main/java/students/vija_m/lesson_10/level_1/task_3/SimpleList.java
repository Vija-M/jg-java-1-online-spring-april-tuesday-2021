package students.vija_m.lesson_10.level_1.task_3;

interface SimpleList <T> {

    //добавить в определённок место списка новый элемент
    void addElement(int i, T value);

    //удалить элемент из определённого места списка
    void deleteElement(int i, T value);

    // удалить первый элемент в списке имеющий заданное значение
    void deleteFirstElementWithSpecificValue(int i, T value);

    //удалить из списка все элементы с заданным значением
    void deleteAllElementsWithSpecificValue(T value);

    // увеличить заданную длинну (размер) списка
    void increaseList(int size);

    // уменьшить заданную длинну (размер) списка
    void decreaseList(int size);

    // поменять местами 2 эдемента
    void switchElements(int i, int y);

    // list.reverse() отобразить весь список в обратном порядке
    SimpleList <T> reverseOrder();
}
