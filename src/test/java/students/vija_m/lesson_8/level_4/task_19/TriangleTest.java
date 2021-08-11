package students.vija_m.lesson_8.level_4.task_19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void TriangleSideLength1() {
        Triangle victim = new Triangle(1);
        assertEquals(0.43, victim.calculateArea(), 0.01);
        assertEquals(3, victim.calculatePerimeter());
    }

    @Test
    void TriangleSideLength122() {
        Triangle victim = new Triangle(122);
        assertEquals(6444.96, victim.calculateArea(), 0.01);
        assertEquals(366, victim.calculatePerimeter());
    }
}