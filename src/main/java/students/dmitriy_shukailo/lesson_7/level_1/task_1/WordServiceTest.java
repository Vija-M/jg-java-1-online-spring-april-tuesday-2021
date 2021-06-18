package students.dmitriy_shukailo.lesson_7.level_1.task_1;

public class WordServiceTest {

    WordService wordService = new WordService();

    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findEqualWords();
        wordServiceTest.notFindEqualWords();
    }

    public void findEqualWords() {

        String test = "foo bro foo bar bro foo";
        checkTest("foo", wordService.findMostFrequentWord(test), "EqualWords have been found");
    }

    public void notFindEqualWords() {

        String test = "foo bro bar bzz";
        checkTest("foo", wordService.findMostFrequentWord(test), "EqualWords haven't been found");
    }

    private void checkTest(String expected, String actual, String test) {

        if (expected.equals(actual)) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}