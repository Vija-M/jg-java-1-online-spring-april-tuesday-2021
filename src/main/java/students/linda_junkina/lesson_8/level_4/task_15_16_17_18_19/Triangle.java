package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

class Triangle extends Shape {

    double high;
    int sideA;
    int sideB;
    int sideC;

    public Triangle(String title, int high, int sideA, int sideB, int sideC) {
        super(title);
        this.high = high;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        return (high * sideA) / 2;
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
