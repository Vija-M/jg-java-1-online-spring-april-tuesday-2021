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
        String testText = "Oracle (and others) highly recommend uninstalling outdated Java versions because of \n" +
                "serious risks due to unresolved security issues.";
        assertTestResult("Oracle", wordService.findMostFrequentWord(testText), "No equal words");
    }

    private void testSecond() {
        String testText = "Intellij Idea is the best Java language IDE. One of most popular programming language \n" +
                "is Java. Try that most popular language once, and you will love Java.";
        assertTestResult("Java", wordService.findMostFrequentWord(testText), "Four equal words(Java and language)");
    }

    private void testThird() {
        String testText = "In this program, we need to find the most repeated word present in given text file. \n" +
                "This can be done by opening a file in read mode using file pointer.";
        assertTestResult("file", wordService.findMostFrequentWord(testText), "Three equal words(file)");
    }
}
