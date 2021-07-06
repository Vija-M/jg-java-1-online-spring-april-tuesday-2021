package students.dmitrijs_matrenicevs.lesson_10.level_1.task_3;

interface SimpleList<T> {

    void deleteObject(int a, T value);
    //удалить обьект из определенного места в списке

    void lengthIncreaseList(int size);
    //увеличить заданную длину

    void lengthReduceList(int size);
    //уменьшить заданную длину

    void createList(T value);
    //создать список

    void deleteList(T value);
    //удалить спискок

    int findMin(int a,T value);
    //найти минимальный элемент

    int findMax(int a,T value);
    //найти максимальный элемент

    void printList();
    //печатает список

    void removeElementBeginning(int a);
    //убрать элемент в начало списка

    void removeElementToTheEnd();
    //убрать элемент в конец списка
}
