package students.dmitriy_shukailo.lesson_3.level_5.task_21;

class Dog {

    String dogName = "Bobik";
    int dogAge = 3;
    String dogColor = "Orange";

    void voice(){
        System.out.println(dogName + "! " + "I am " + dogAge + " and I am " + dogColor);
    }

    void changeColor(String newColor) {
      dogColor = newColor;
    }
}