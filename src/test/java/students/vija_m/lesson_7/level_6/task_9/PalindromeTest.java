package students.vija_m.lesson_7.level_6.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome subject = new Palindrome();

    @Test
    void isPalindrome1() {
        assertTrue(subject.isPalindrome("racecar"));
           }
    @Test
    void isPalindrome2() {
        assertTrue(subject.isPalindrome("level"));
    }
    @Test
    void isPalindrome3() {
        assertTrue(subject.isPalindrome("sum summus mus"));
    }
    @Test
    void isPalindrome4() {
        assertTrue(subject.isPalindrome("А роза упала на лапу Азора"));
    }
}