package students.dmitrijs_matrenicevs.lesson_7.level_1.task_1;

class WordServiceTest {

WordService wordService = new WordService();

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();

    }

    void testWordsOne () {
        String textTest = "JAVA";
        resultTestWords("IT",wordService.findMostFrequentWord(textTest),"JAVA LIKE MANY PEOPLE");
    }

    void  testWordsTwo () {
        String textTest = "JAVA BEST";
        resultTestWords("IT",wordService.findMostFrequentWord(textTest),"JAVA LIKE MANY COUNTRY");
    }

    void  testWordsTwo () {
        String textTest = "JAVA FAIL";
        resultTestWords("IT",wordService.findMostFrequentWord(textTest),"JAVA FAIL");
    }




}
