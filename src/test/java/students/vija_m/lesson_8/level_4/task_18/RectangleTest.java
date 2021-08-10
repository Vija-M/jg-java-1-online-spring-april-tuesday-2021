package students.vija_m.lesson_8.level_4.task_18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void Rectangle1() {
        Rectangle victim = new Rectangle(2, 0.5);
        assertEquals(1, victim.calculateArea());
        assertEquals(5, victim.calculatePerimeter());
    }

    @Test
    void Rectangle2() {
        Rectangle victim = new Rectangle(126, 94.25);
        assertEquals(11875.5, victim.calculateArea());
        assertEquals(440.5, victim.calculatePerimeter());
    }
}