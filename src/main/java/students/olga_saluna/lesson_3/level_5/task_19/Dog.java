package students.olga_saluna.lesson_3.level_5.task_19;

class Dog {

    String name;
    int age;
    Dog (String name, int age){
        this.name = name;
        this.age = age;
    }
    void voice(){
        System.out.println ("My name is " + this.name + " and my age is " + this.age);
    }
    void happyBirthday(){
        this.age = this.age +1;
    }
}
