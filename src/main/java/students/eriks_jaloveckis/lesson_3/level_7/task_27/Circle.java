package students.eriks_jaloveckis.lesson_3.level_7.task_27;

class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void calculateArea(){
        double result = (radius * radius) * 3.14;
        System.out.println("Radius is - " +radius);
        System.out.println("Area is   - " + result);
    }

}
