package students.vija_m.lesson_7.level_1.task_1;

class WordServiceTest {
    WordService wordService = new WordService();

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.equalWords1();
        test.equalWords2();
        test.equalWords3();
    }

    public void equalWords1() {
        String text = "Я люблю море. Я лечу на море. Я умею плавать в море. Какое чистое море! Хочу на море. Завтра поедем на море";
        assertTest("море", wordService.findMostFrequentWord(text), "Six equal words");
    }

    public void equalWords2() {
        String text = "Я люблю море. Я лечу на море. Я умею плавать в море.";
        assertTest("Я", wordService.findMostFrequentWord(text), "Two words are repeating twice");
    }

    public void equalWords3() {
        String text = "Я люблю море. Лечу плавать, отдыхать, загарать и любоваться просторами.";
        assertTest("Я", wordService.findMostFrequentWord(text), "No equal words");
    }

    public void assertTest(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }
}
