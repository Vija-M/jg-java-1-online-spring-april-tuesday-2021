package students.ernests_subhankulovs.lesson_10.level_1.task_3;

interface SimpleList<T> {
    //Добавить новый элемент в определённой позиции списка
    void addElement(int position, T value);
    //Добавить новый элемент в начале списка
    void addElementAtBeginning(T value);
    //Добавить новый элемент в конце списка
    void addElementAtEnd(T value);
    //Убрать элемент в определённой позиции списка
    void removeElement(int position);
    //Убрать элемент в начале списка
    void removeElementFromBeginning();
    //Убрать элемент в конце списка
    void removeElementFromEnd();
    //Сортировать список в обратном порядке
    SimpleList<T> reverseOrder();
    //Изменить размер списка
    void resize(int size);
    //Превратить определённый интервал из списка в новый, отдельный список
    SimpleList<T> extractSublist(int fromElement, int toElement);


}
