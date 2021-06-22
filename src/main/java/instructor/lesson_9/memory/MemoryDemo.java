package instructor.lesson_9.memory;

class MemoryDemo {

    public static void main(String[] args) {

        int x = 5;
        int y = 12;

        Foo foo = new Foo();
        Bar bar = new Bar();

        foo.methodFoo(x);
        bar.methodBar();

        System.out.println("Finish");

    }
}
