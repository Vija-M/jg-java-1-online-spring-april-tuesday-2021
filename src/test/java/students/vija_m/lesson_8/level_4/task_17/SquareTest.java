package students.vija_m.lesson_8.level_4.task_17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void sideLengthIs1() {
        Square victim = new Square(1);
        assertEquals(1, victim.calculateArea(), "Area of the square with side length = 1");
        assertEquals(4, victim.calculatePerimeter(), "Perimeter of the square with side length = 1");
    }

    @Test
    void sideLengthIs50() {
        Square victim = new Square(50);
        assertEquals(2500, victim.calculateArea(), "Area of the square with side length = 50");
        assertEquals(200, victim.calculatePerimeter(), "Perimeter of the square with side length = 1");
    }
}
