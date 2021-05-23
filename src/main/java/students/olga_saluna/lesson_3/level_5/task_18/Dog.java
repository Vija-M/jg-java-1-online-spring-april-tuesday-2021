package students.olga_saluna.lesson_3.level_5.task_18;

class Dog {
    int age;
    String name;
    Dog (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void voice(){
        System.out.println ("My name is " + this.name + " and my age is " + this.age);
    }
}
