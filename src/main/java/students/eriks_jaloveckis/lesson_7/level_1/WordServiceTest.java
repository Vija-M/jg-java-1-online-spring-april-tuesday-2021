package students.eriks_jaloveckis.lesson_7.level_1;

class WordServiceTest {

    WordService wordService = new WordService();

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testFirst();
        wordServiceTest.testSecond();
        wordServiceTest.testThird();

    }

    private void assertTestResult(String expected, String realResult, String testName) {
        if (expected.equals(realResult)) {
            System.out.println(testName + " IS OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }

    private void testFirst() {
        String text = "Мяч упал. Мяч накачали. Мяч сдулся.";
        assertTestResult("Мяч", wordService.findMostFrequentWord(text), "Test 1");
    }

    private void testSecond() {
        String text = "Мяч упал. Мяч накачали. Солнце светит. Солнце заходит.";
        assertTestResult("Мяч", wordService.findMostFrequentWord(text), "Test 2");
    }

    private void testThird() {
        String text = "Мяч упал. Солнце заходит. На улице темнеет.";
        assertTestResult("Мяч", wordService.findMostFrequentWord(text), "Test 3");
    }

}
