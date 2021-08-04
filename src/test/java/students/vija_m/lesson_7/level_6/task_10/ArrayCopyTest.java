package students.vija_m.lesson_7.level_6.task_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCopyTest {
    ArrayCopy victim = new ArrayCopy();

    @Test
    void ArrayCopy() {
        assertArrayEquals(new int[]{40, 30, 19, 77}, victim.copyInRange(new int[]{2, 2, 6, 9, 7, 100, 40, 30, 19, 77}, 10, 80));
    }

    @Test
    void ArrayCopyNoOutput() {
        assertArrayEquals(new int[]{}, victim.copyInRange(new int[]{2, 2, 6, 9, 7, 100, 40, 30, 19, 77}, 10, 15));
    }

    @Test
    void ArrayCopyOnlyOne() {
        assertArrayEquals(new int[]{40}, victim.copyInRange(new int[]{2, 2, 6, 9, 7, 100, 40, 30, 19, 77}, 40, 50));
    }

    @Test
    void ArrayCopyRepeatingNumbers() {
        assertArrayEquals(new int[]{2, 2, 6, 9, 7, 6, 9}, victim.copyInRange(new int[]{2, 2, 6, 9, 7, 100, 6, 30, 9, 77}, 1, 10));
    }

    @Test
    void ArrayCopyNegativeAndPositiveNumbers() {
        assertArrayEquals(new int[]{0, -2, -6, 2, 6, 9, 7, -9, 0, 6, 9}, victim.copyInRange(new int[]{0, -2, -6, 2, 6, 9, 7, -99, 100, -9, 0, 6, 30, 9, 77}, -10, 10));
    }
}