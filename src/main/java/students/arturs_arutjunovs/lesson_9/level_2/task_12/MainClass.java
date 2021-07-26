package students.arturs_arutjunovs.lesson_9.level_2.task_12;

//Каждый последующий класс наследует предыдущий, и в итоге класс C наследует все конструкторы
// предыдущих, говоря другими словами - собрал в себе (унаследовал) все три вывода на консоль.
//В main() методе, объект класса C "c" выдает нам эти три вывода на консоль.

/*
Class A Constructor
Class B Constructor
Class C Constructor
*/

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

class MainClass {
    public static void main(String[] args) {

        C c = new C();

    }
}
