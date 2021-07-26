package students.ernests_subhankulovs.lesson_10.level_7.task_26;

import java.lang.reflect.Array;
import java.util.Arrays;

class SimpleListImplementation<T> implements SimpleList<T> {

    private T[] simpleList = (T[]) Array.newInstance(SimpleListImplementation.class, 0);

    class ArrayBasicList<T> {
        private final T[] array;

        public ArrayBasicList(Class<T> type, int capacity) {
            array = (T[]) Array.newInstance(type,  capacity);
        }

        public T[] getArray() {
            return array;
        }

    }

    SimpleListImplementation() {

    }

    SimpleListImplementation(T[] simpleList) {
        this.simpleList = simpleList;
    }

    private void setSimpleList(T[] simpleList) {
        this.simpleList = simpleList;
    }

    @Override
    public T getElement(int i) {
        return simpleList[i];
    }

    @Override
    public int getLength() {
        return simpleList.length;
    }

    @Override
    public void addElement(int position, T value) {
        ArrayBasicList arrayBasicList = new ArrayBasicList(value.getClass(), simpleList.length + 1);
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = 0; i < position; i++) {
            newList[i] = simpleList[i];
        }
        newList[position] = value;
        for (int i = position; i < simpleList.length; i++) {
            newList[i + 1] = simpleList[i];
        }
        simpleList = newList;
    }

    @Override
    public void addElementAtBeginning(T value) {
        ArrayBasicList arrayBasicList = new ArrayBasicList(value.getClass(), simpleList.length + 1);
        T[] newList = (T[]) arrayBasicList.getArray();
        newList[0] = value;
        for (int i = 1; i <= simpleList.length; i++) {
            newList[i] = simpleList[i - 1];
        }
        simpleList = newList;
    }

    @Override
    public void addElementAtEnd(T value) {
        ArrayBasicList arrayBasicList = new ArrayBasicList(value.getClass(), simpleList.length + 1);
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = 0; i < simpleList.length; i++) {
            newList[i] = simpleList[i];
        }
        newList[newList.length - 1] = value;
        simpleList = newList;
    }

    @Override
    public void removeElement(int position) {
        ArrayBasicList arrayBasicList = new ArrayBasicList(simpleList[0].getClass(), simpleList.length - 1);
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = 0; i < position; i++) {
            newList[i] = simpleList[i];
        }
        for (int i = position; i < simpleList.length - 1; i++) {
            newList[i] = simpleList[i + 1];
        }
        simpleList = newList;
    }

    @Override
    public void removeElementFromBeginning() {
        ArrayBasicList arrayBasicList = new ArrayBasicList(simpleList[0].getClass(), simpleList.length - 1);
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = 0; i < simpleList.length - 1; i++) {
            newList[i] = simpleList[i + 1];
        }
        simpleList = newList;
    }

    @Override
    public void removeElementFromEnd() {
        ArrayBasicList arrayBasicList = new ArrayBasicList(simpleList[0].getClass(), simpleList.length - 1);
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = 0; i < simpleList.length - 1; i++) {
            newList[i] = simpleList[i];
        }
        simpleList = newList;
    }

    @Override
    public SimpleList<T> reverseOrder() {
        ArrayBasicList arrayBasicList = new ArrayBasicList(simpleList[0].getClass(), simpleList.length);
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = 0; i < simpleList.length; i++) {
            newList[simpleList.length - i - 1] = simpleList[i];
        }
        SimpleList<T> reversedSimpleList = new SimpleListImplementation(newList);
        return reversedSimpleList;
    }

    @Override
    public void resize(int size) {
        ArrayBasicList arrayBasicList = new ArrayBasicList(simpleList[0].getClass(), size);
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = 0; i < size; i++) {
            if (i < simpleList.length) {
                newList[i] = simpleList[i];
            }
        }
        simpleList = newList;
    }

    @Override
    public SimpleList<T> extractSublist(int fromElement, int toElement) {
        ArrayBasicList arrayBasicList = new ArrayBasicList(simpleList[0].getClass(), (toElement - fromElement + 1));
        int j = 0;
        T[] newList = (T[]) arrayBasicList.getArray();
        for (int i = fromElement; i <= toElement; i++) {
            newList[j] = simpleList[i];
            j++;
        }
        SimpleList<T> simpleSubList = new SimpleListImplementation(newList);
        return simpleSubList;
    }

    @Override
    public String toString() {
        return "SimpleListImplementation{" +
                "simpleList=" + Arrays.toString(simpleList) +
                '}';
    }

}
