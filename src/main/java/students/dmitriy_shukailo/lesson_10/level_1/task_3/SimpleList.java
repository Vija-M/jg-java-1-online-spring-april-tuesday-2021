package students.dmitriy_shukailo.lesson_10.level_1.task_3;

interface SimpleList<T> {

    void createList();
// создает список

    void deleteList();
// удаляет список

    void copyList();
// копирует список

    void printList();
// печатает список

    void addElementToList(int id, T value);
// добавляет элемент в список

    void removeElementFromList(int id, T value);
// удаляет элемент из списка

    void sortElementUp(T list);
// сортирует элементы по возрастанию

    void sortElementDown(T list);
// сортирует элементы по убыванию

    void findMaxElement(T value);
// находит максимальный элемент

    void findMinElement(T value);
// находит минимальный элемент

    void findEqualsElement(int id, T value);
// находит эквивалентые элементы

}