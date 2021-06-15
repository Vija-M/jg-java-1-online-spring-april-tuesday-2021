package instructor.lesson_3;

class MySquare {

    int sideLength;

    MySquare(int sideLength) {
        this.sideLength = sideLength;
    }

    int perimeter() {
        return 4 * this.sideLength;
    }

    int area() {
        return this.sideLength * this.sideLength;
    }

    void printInfo() {
        System.out.println("Side length = " + this.sideLength);
        System.out.println("Perimeter   = " + this.perimeter());
        System.out.println("Area        = " + this.area());
    }
}
