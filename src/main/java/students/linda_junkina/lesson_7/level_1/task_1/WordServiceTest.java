package students.linda_junkina.lesson_7.level_1.task_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.scenario1();
    }

    public void scenario1() {
        WordService wordService = new WordService();
        String expected = "foo";
        String findMostFrequentWord = wordService.findMostFrequentWord("foo bar quux foo baz");
        checkTestResult(findMostFrequentWord.equals(expected), "The most frequent word is foo");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}