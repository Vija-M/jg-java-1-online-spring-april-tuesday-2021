package students.ernests_subhankulovs.lesson_10.level_1.task_3;

interface SimpleList<T> {
    void addElement(T[] simpleList, int position);
    void addElementAtBeginning(T[] simpleList, int position);
    void addElementAtEnd(T[] simpleList, int position);
    void removeElement(T[] simpleList, int position);
    void removeElementFromBeginning(T[] simpleList);
    void removeElementFromEnd(T[] simpleList);
    void reverseOrder(T[] simpleList);
    void resize(T[] simpleList, int size);
    T[] extractSublist(T[] simpleList, int fromElement, int toElement);


}
