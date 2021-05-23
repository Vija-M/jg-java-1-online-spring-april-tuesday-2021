package students.dmitrijs_matrenicevs.lesson_3.level_7.task_27;

class Circle {

    double radius;

    Circle(double radius){

        this.radius = radius;
    }

    double calculateArea(){

        return  3.14 * this.radius * this.radius;

    }

    void finish (){
        System.out.print("Радиус круга " + radius + calculateArea());
    }


}
