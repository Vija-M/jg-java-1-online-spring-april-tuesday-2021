package students.dmitrijs_matrenicevs.lesson_7.level_1.task_1;

class WordServiceTest {

WordService wordService = new WordService();

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testWordsOne();
        wordServiceTest.testWordsTwo();
        wordServiceTest.testWordsResult();

    }

    void testWordsOne () {
        String textTest = "WORDS";
        resultTestWords("IT WORDS",wordService.findMostFrequentWord(textTest),"WORDS LIKE MANY PEOPLE");
    }

    void  testWordsTwo () {
        String textTest = "WORDS BEST";
        resultTestWords("JAVA WORDS",wordService.findMostFrequentWord(textTest),"WORDS LIKE MANY COUNTRY");
    }

    void testWordsResult () {
        String textTest = "WORDS FAIL";
        resultTestWords("WORDS",wordService.findMostFrequentWord(textTest),"WORDS FAIL");
    }

    void resultTestWords(String expectedResult,String finishResult, String name){
        if (expectedResult.equals(finishResult)) {
            System.out.println(name + " = OK");
        }
        else {
            System.out.println(name + " = FAIL");
            
        }
        
    }




}
