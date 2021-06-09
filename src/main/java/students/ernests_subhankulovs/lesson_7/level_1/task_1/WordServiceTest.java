package students.ernests_subhankulovs.lesson_7.level_1.task_1;

class WordServiceTest {

    WordService wordService = new WordService();

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testExample1();
        test.testExample2();
        test.testExampleWithoutRepeats();
        test.testExampleWithIdenticalRepeats();
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

    public void testExampleWithoutRepeats() {
        String sampleText = "Объекты предоставляют поведение и скрывают данные.";
        assertTestResult("Объекты", wordService.findMostFrequentWord(sampleText), "Test 3 (without repeats)");
    }

    public void testExampleWithIdenticalRepeats() {
        String sampleText = "One One Two Two";
        assertTestResult("One", wordService.findMostFrequentWord(sampleText), "Test 4 (with identical number of repeats)");
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
