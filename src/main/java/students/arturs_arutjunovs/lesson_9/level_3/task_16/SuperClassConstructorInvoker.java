package students.arturs_arutjunovs.lesson_9.level_3.task_16;

//super() должен всегда идти первым в теле конструктора

class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
