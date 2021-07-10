package students.eriks_jaloveckis.lesson_10.level_1.task_3;

interface SimpleList <T> {
    void addValue (int place, T value );
    // добавить значение (место, что именно)
    void deleteValue (int place, T value);
    // удалить значение (место, что именно)
    void searchValue (T value);
    // поиск определенных значений
    void deleteAllValue (T value);
    // удаление всех однотипных значений
    void deleteSomeValue (int place);
    // удаление опреденного значения
    void replaceValues (int oldPlace, int newPlace);
    // замена значений
    void increaseList(int size);
    // увеличить размер списка
    void decreaseList(int size);
    // уменьшить размер списка

}
