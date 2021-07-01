package students.ernests_subhankulovs.lesson_10.level_1.task_3;

interface SimpleList<T> {
    //Добавить новый элемент в определённой позиции списка
    void addElement(T simpleList, int position, T value);
    //Добавить новый элемент в начале списка
    void addElementAtBeginning(T simpleList, T value);
    //Добавить новый элемент в конце списка
    void addElementAtEnd(T simpleList, T value);
    //Убрать элемент в определённой позиции списка
    void removeElement(int position,  T simpleList);
    //Убрать элемент в начале списка
    void removeElementFromBeginning(T simpleList);
    //Убрать элемент в конце списка
    void removeElementFromEnd(T simpleList);
    //Сортировать список в обратном порядке
    T reverseOrder(T simpleList);
    //Изменить размер списка
    void resize(T simpleList, int size);
    //Превратить определённый интервал из списка в новый, отдельный список
    T extractSublist(T simpleList, int fromElement, int toElement);


}
