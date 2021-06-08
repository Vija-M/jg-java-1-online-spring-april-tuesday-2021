package instructor.lesson_7;

class Counter {

    private int currentValue;

    public int getCurrentValue() {
        return currentValue;
    }

    void increment() {
        foo();
        currentValue++;
    }

    void decrement() {
        foo();
        currentValue--;
    }

    private void foo() {

    }
}
