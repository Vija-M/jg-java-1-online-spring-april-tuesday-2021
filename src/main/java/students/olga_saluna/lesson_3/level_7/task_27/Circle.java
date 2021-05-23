package students.olga_saluna.lesson_3.level_7.task_27;

class Circle {
    double radius;
    Circle (double radius){
        this.radius=radius;
    }
    double calculateArea(){
        return Math.PI * this.radius*this.radius;
    }
    void circleArea (){
        System.out.println("Radius is " + this.radius + " and circle area is " + calculateArea() + ".");
    }
}
