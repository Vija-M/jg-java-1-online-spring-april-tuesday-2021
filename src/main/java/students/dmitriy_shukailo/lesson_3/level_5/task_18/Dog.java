package students.dmitriy_shukailo.lesson_3.level_5.task_18;

class Dog {

    String dogName;
    int dogAge;

    Dog (String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void voice(){
        System.out.println(dogName + "! " + "I am " + dogAge);
    }
}