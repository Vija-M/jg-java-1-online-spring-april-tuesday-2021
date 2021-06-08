package instructor.lesson_7;

class CounterDemo {

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println("counter.currentValue = " + counter.getCurrentValue());

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println("counter.currentValue = " + counter.getCurrentValue());

        counter.decrement();
        counter.decrement();
        counter.decrement();

        counter.increment();

        System.out.println("counter.currentValue = " + counter.getCurrentValue());

    }
}
