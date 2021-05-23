package students.olga_saluna.lesson_3.level_5.task_20;

class Dog {
    String name;
    int age;
    String color;
    Dog (String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color=color;
    }
    void voice(){
        System.out.println ("My name is " + this.name + ". My age is "+ this.age + " and my color is " + this.color+".");
    }

}
