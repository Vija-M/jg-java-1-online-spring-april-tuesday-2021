package students.dmitriy_shukailo.lesson_3.level_5.task_19;

class Dog {

    String dogName = "Bobik";
    int dogAge = 3;

    void voice(){
        System.out.println(dogName + "! " + "I am " + dogAge);
    }

    void happyBirthday(){
        dogAge = dogAge + 1;
    }
}