package students.vija_m.lesson_7.level_7.task_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordServiceTest {
    WordService victim = new WordService();

    @Test
    void sixFrequentWords() {
        assertEquals("море", victim.findMostFrequentWord("Я люблю море. Я лечу на море. Я умею плавать в море. Какое чистое море! Хочу на море. Завтра поедем на море."));
    }

    @Test
    void threeFrequentWords() {
        assertEquals("Я", victim.findMostFrequentWord("Я очень люблю море. Я лечу туда. Я умею плавать там."));
    }

    @Test
    void noFrequentWords() {
        assertEquals("Я", victim.findMostFrequentWord("Я люблю море. Лечу плавать, отдыхать, загарать и любоваться просторами."));
    }

    @Test
    void noWords() {
        assertEquals("", victim.findMostFrequentWord(""));
    }
}
