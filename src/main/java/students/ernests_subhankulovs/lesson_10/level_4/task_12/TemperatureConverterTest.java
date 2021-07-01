package students.ernests_subhankulovs.lesson_10.level_4.task_12;

class TemperatureConverterTest {
    public static void main(String[] args) {

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
