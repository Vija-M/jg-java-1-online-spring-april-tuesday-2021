package students.arturs_arutjunovs.lesson_7.level_1.task_1;

class WordServiceTest {
    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();

        test.EqualWords_Test1();
        test.EqualWords_Test2();
        test.notDetectEqualWords();
    }


    public void EqualWords_Test1() {
        WordService wordService = new WordService();
        String testText = "Intellij Idea is the best Java language IDE. One of most popular programming language \n" +
                "is Java. Try that most popular language once, and you will love Java.";
        assertCheckResult("Java", wordService.findMostFrequentWord(testText), "Four equal words(Java and language)");
    }

    public void EqualWords_Test2() {
        WordService wordService = new WordService();
        String testText = "In this program, we need to find the most repeated word present in given text file. \n" +
                "This can be done by opening a file in read mode using file pointer.";
        assertCheckResult("file", wordService.findMostFrequentWord(testText), "Three equal words(file)");
    }

    public void notDetectEqualWords() {
        WordService wordService = new WordService();
        String testText = "Oracle (and others) highly recommend uninstalling outdated Java versions because of \n" +
                "serious risks due to unresolved security issues.";
        assertCheckResult("Oracle", wordService.findMostFrequentWord(testText), "No equal words");

    }

    public void assertCheckResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("[ OK ] " + testName);
        } else {
            System.out.println("[ FAILED ] " + testName);
        }
    }
}
