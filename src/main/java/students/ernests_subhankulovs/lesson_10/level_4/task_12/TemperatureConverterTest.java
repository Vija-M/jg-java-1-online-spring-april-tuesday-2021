package students.ernests_subhankulovs.lesson_10.level_4.task_12;

class TemperatureConverterTest {

    CelsiusToFahrenheitConverter fahrenheitConverter = new CelsiusToFahrenheitConverter();
    CelsiusToKelvinConverter kelvinConverter = new CelsiusToKelvinConverter();

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.celsiusToKelvinZeroTest();
        test.celsiusToFahrenheitZeroTest();
        test.celsiusToKelvinHundredTest();
        test.celsiusToFahrenheitHundredTest();
    }

    public void celsiusToKelvinZeroTest() {
        assertTestResult(273.15, kelvinConverter.convert(0), "Celsius to Kelvin test - Zero degrees");
    }

    public void celsiusToFahrenheitZeroTest() {
        assertTestResult(32, fahrenheitConverter.convert(0), "Celsius to Fahrenheit test - Zero degrees");
    }

    public void celsiusToKelvinHundredTest() {
        assertTestResult(373.15, kelvinConverter.convert(100), "Celsius to Kelvin test - 100 degrees");
    }

    public void celsiusToFahrenheitHundredTest() {
        assertTestResult(212, fahrenheitConverter.convert(100), "Celsius to Fahrenheit test - 100 degrees");
    }

    private void assertTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + kelvinConverter.convert(0));
        }
    }
}

