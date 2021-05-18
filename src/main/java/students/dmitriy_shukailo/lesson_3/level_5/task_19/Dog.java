package students.dmitriy_shukailo.lesson_3.level_5.task_19;

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

    void happyBirthday(){
        dogAge = dogAge + 1;
    }
}