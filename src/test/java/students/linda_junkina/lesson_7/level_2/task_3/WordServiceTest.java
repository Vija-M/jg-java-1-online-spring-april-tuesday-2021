package students.linda_junkina.lesson_7.level_2.task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordServiceTest {
    WordService wordService = new WordService();

    @Test
    void scenario1() {
        assertEquals("foo", wordService.findMostFrequentWord("foo bar foo quux foo baz foo"));
    }

    @Test
    void scenario2() {
        assertEquals("bar", wordService.findMostFrequentWord("foo bar quux foo bar"));
    }

    @Test
    void scenario3() {
        assertEquals("bar", wordService.findMostFrequentWord("foo bar quux"));
    }

    @Test
    void scenario4() {
        assertEquals("foo", wordService.findMostFrequentWord("foo"));
    }

    @Test
    void scenario5() {
        assertEquals("", wordService.findMostFrequentWord(""));
    }
}