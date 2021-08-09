package students.vija_m.lesson_8.level_4.task_16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void radiusIs1() {
        Circle victim = new Circle(1);
        assertEquals(3.14, victim.calculateArea(), "Area of the circle with radius = 1");
        assertEquals(6.28, victim.calculatePerimeter(), "Perimeter of the circle with radius = 1");
    }

    @Test
    void radiusIs11() {
        Circle victim = new Circle(11);
        assertEquals(379.94, victim.calculateArea(), "Area of the circle with radius = 1");
        assertEquals(69.08, victim.calculatePerimeter(), "Perimeter of the circle with radius = 1");
    }


}