package students.ernests_subhankulovs.lesson_10.level_1.task_3;

interface SimpleList<T> {
    //Добавить новый элемент в определённой позиции списка
    void addElement(int position, T value);
    //Добавить новый элемент в начале списка
    void addElementAtBeginning(T value);
    //Добавить новый элемент в конце списка
    void addElementAtEnd(T value);
    //Убрать элемент в определённой позиции списка
    void removeElement(int position,  T value);
    //Убрать элемент в начале списка
    void removeElementFromBeginning(T value);
    //Убрать элемент в конце списка
    void removeElementFromEnd(T value);
    //Сортировать список в обратном порядке
    T reverseOrder(T value);
    //Изменить размер списка
    void resize(int size, T simpleList);
    //Превратить определённый интервал из списка в новый, отдельный список
    T extractSublist(int fromElement, int toElement, T simpleList);


}
