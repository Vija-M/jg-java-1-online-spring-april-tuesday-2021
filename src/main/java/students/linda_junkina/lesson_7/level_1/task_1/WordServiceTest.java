package students.linda_junkina.lesson_7.level_1.task_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
    }

    public void scenario1() {
        WordService wordService = new WordService();
        String expected = "foo";
        String findMostFrequentWord = wordService.findMostFrequentWord("foo bar foo quux foo baz foo");
        checkTestResult(findMostFrequentWord.equals(expected), "The most frequent word is 'foo'");
    }

    public void scenario2() {
        WordService wordService = new WordService();
        String expected = "bar";
        String findMostFrequentWord = wordService.findMostFrequentWord("foo bar quux foo bar");
        checkTestResult(findMostFrequentWord.equals(expected), "The most frequent words are 'foo' and 'bar'");
    }

    public void scenario3() {
        WordService wordService = new WordService();
        String expected = "bar";
        String findMostFrequentWord = wordService.findMostFrequentWord("foo bar quux");
        checkTestResult(findMostFrequentWord.equals(expected), "All words are equally frequent");
    }

    public void scenario4() {
        WordService wordService = new WordService();
        String expected = "foo";
        String findMostFrequentWord = wordService.findMostFrequentWord("foo");
        checkTestResult(findMostFrequentWord.equals(expected), "There is only one word in the text");
    }

    public void scenario5() {
        WordService wordService = new WordService();
        String expected = "";
        String findMostFrequentWord = wordService.findMostFrequentWord("");
        checkTestResult(findMostFrequentWord.equals(expected), "The is no any word in the text");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}