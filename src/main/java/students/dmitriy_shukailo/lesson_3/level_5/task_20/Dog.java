package students.dmitriy_shukailo.lesson_3.level_5.task_20;

class Dog {

    String dogName;
    int dogAge;
    String dogColor;

    Dog (String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voice(){
        System.out.println(dogName + "! " + "I am " + dogAge + " and I am " + dogColor);
    }

    void happyBirthday(){
        dogAge = dogAge + 1;
    }
}