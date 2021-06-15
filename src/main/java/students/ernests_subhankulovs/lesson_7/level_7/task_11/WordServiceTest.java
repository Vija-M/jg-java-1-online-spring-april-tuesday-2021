package students.ernests_subhankulovs.lesson_7.level_7.task_11;

class WordServiceTest {

    WordService wordService = new WordService();

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testExample1();
        test.testExample2();
        test.testExample3();
        test.testExample4();
    }

    public void testExample1() {
        String sampleText = "Процедурный код (код, использующий структуры данных) позволяет легко добав-" +
                            "лять новые функции без изменения существующих структур данных. Объектно-" +
                            "ориентированный код, напротив, упрощает добавление новых классов без изме-" +
                            "нения существующих функций.";
        assertTestResult("код", wordService.findMostFrequentWord(sampleText), "Test 1");
    }

    public void testExample2() {
        String sampleText = "Хорошо известное эвристическое правило, называемое законом Деметры, гласит," +
                            "что модуль не должен знать внутреннее устройство тех объектов, с которыми он" +
                            "работает. Как мы видели в предыдущем разделе, объекты скрывают свои данные" +
                            "и предоставляют операции для работы с ними. Это означает, что объект не дол-" +
                            "жен раскрывать свою внутреннюю структуру через методы доступа, потому что" +
                            "внутреннюю структуру следует скрывать.";
        assertTestResult("что", wordService.findMostFrequentWord(sampleText), "Test 2");
    }

    public void testExample3() {
        String sampleText = "";
        assertTestResult("", wordService.findMostFrequentWord(sampleText), "Test 3");
    }

    public void testExample4() {
        String sampleText = "word";
        assertTestResult("word", wordService.findMostFrequentWord(sampleText), "Test 4");
    }

    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
