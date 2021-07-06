package students.arturs_arutjunovs.lesson_10.level_1.task_3;

interface SimpleList<T> {

    void createList(T value); //создает список
    void deleteList(T value); //удаляет список
    void copyElement(int unit, T value); //копирует элемент списка
    void addElementToList(int unit, T value); //добавляет элемент в список
    void printList();  //выводит список на печать
    void removeElementFromList(int unit, T value);  //удаляет элемент из списка
    int findMinElement(int unit, T value);  //находит минимальный элемент
    int findMaxElement(int unit, T value);  //находит максимальный элемент
    void removeElementsButMin(int unit, T value); //удаляет элементы кроме минимального
    void removeElementsButMax(int unit, T value); //удаляет элементы кроме максимального
    void sortElementUp(T list);  //сортирует элементы по возрастанию
    int findSumOfElements(int unit, T list);  //считает сумму элементов в списке
    boolean findEqualElements(int unit, T value);  //находит, есть равные элементы в списке
    SimpleList<T> sortReverseOrder();  //сортировать список в обратном порядке
}
