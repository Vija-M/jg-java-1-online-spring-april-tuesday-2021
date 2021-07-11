package students.dmitrijs_matrenicevs.lesson_10.level_1.task_3;

interface SimpleList<T> {

    void deleteObject(int i);
    //удалить обьект из определенного места в списке

    void lengthIncreaseList(int size);
    //увеличить заданную длину

    void lengthReduceList(int size);
    //уменьшить заданную длину

    void deleteList(T value);
    //удалить спискок

    int findMinElement(int unit,T value);
    //найти минимальный элемент

    int findMaxElement(int unit,T value);
    //найти максимальный элемент

    void removeElementBeginning();
    //убрать элемент в начало списка

    void removeElementToTheEnd();
    //убрать элемент в конец списка
}
