package instructor.lesson_3;

class Point {

    int x;
    int y;

    Point() {

    }

    Point(int x, int y) {
        /*
        Point b = new Point();
        b.x = 4;
        b.y = 2;
         */
        //Point this = new Point();
        this.x = x;
        this.y = y;
    }

    void printInfo() {
        System.out.println("[" + this.x + ", " + this.y + "]");
    }
}
