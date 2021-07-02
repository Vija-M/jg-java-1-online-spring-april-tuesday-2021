package students.arturs_arutjunovs.lesson_10.level_1.task_3;

interface SimpleList<T> {

    void createEmptyList(); //создает пустой список

    void deleteList(); //удаляет список

    void copyList(); //копирует список

    void addElementToList(int unit, T value); //добавляет элемент в список

    void printList();  //выводит список на печать

    void removeElementFromList(int unit, T value);  //удаляет элемент из списка

    void findMinElement(T value);  //находит минимальный элемент

    void findMaxElement(T value);  //находит максимальный элемент

    void removeElementsButMin(int unit, T value); //удаляет элементы кроме минимального

    void removeElementsButMax(int unit, T value); //удаляет элементы кроме максимального

    void sortElementUp(T list);  //сортирует элементы по возрастанию

    void sortElementDown(T list);  //сортирует элементы по убыванию

    void findEqualElements(int unit, T value);  //находит равные элементы
}
