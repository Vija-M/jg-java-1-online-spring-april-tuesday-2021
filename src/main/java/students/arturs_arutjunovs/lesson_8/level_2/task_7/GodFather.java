package students.arturs_arutjunovs.lesson_8.level_2.task_7;

class GodFather {

    int age;
    String name;

    public GodFather(int age, String name) {  //Например,объявляем конструктор с параметрами,
        this.age = age;
        this.name = name;
    }
}

class Father extends GodFather {

    public Father(int age, String name) { //и соответсвенно в классе наследнике
        super(age, name);                 // должен быть проинициализирован конструктор
                                          //с этими параметрами.
    }


    GodFather son = new GodFather(35, "Garry");

}