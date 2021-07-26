package students.ernests_subhankulovs.lesson_10.level_7.task_27;

class TemperatureConverterTest {

    TemperatureConverter celsiusTemperature = new CelsiusTemperature();
    TemperatureConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();
    TemperatureConverter celsiusToKelvinConverter = new CelsiusToKelvinConverter();
    TemperatureConverter fahrenheitTemperature = new FahrenheitTemperature();
    TemperatureConverter fahrenheitToCelsiusConverter = new FahrenheitToCelsiusConverter();
    TemperatureConverter fahrenheitToKelvinConverter = new FahrenheitToKelvinConverter();
    TemperatureConverter kelvinTemperature = new KelvinTemperature();
    TemperatureConverter kelvinToCelsiusConverter = new CelsiusToKelvinConverter();
    TemperatureConverter kelvinToFahrenheitConverter = new KelvinToFahrenheitConverter();
    TemperatureConverterSelector converterSelector = new TemperatureConverterSelector(celsiusTemperature);

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.celsiusToFahrenheitZeroTest();
        test.celsiusToKelvinZeroTest();
        test.celsiusTemperatureZeroTest();
        test.fahrenheitToCelsiusZeroTest();
        test.fahrenheitToKelvinZeroTest();
        test.fahrenheitTemperatureZeroTest();
        test.kelvinToCelsiusZeroTest();
        test.kelvinToFahrenheitZeroTest();
        test.kelvinTemperatureZeroTest();
        test.celsiusToFahrenheitHundredTest();
        test.celsiusToKelvinHundredTest();
        test.celsiusTemperatureHundredTest();
        test.fahrenheitToCelsiusHundredTest();
        test.fahrenheitToKelvinHundredTest();
        test.fahrenheitTemperatureHundredTest();
        test.kelvinToCelsiusHundredTest();
        test.kelvinToFahrenheitHundredTest();
        test.kelvinTemperatureHundredTest();
    }

    public void celsiusToFahrenheitZeroTest() {
        converterSelector.setConverter(celsiusToFahrenheitConverter);
        assertTestResult(32, converterSelector.convert(0), "Celsius to Fahrenheit test - Zero degrees");
    }

    public void celsiusToFahrenheitHundredTest() {
        converterSelector.setConverter("Celsius", "Fahrenheit");
        assertTestResult(212, converterSelector.convert(100), "Celsius to Fahrenheit test - 100 degrees");
    }

    public void celsiusToKelvinZeroTest() {
        converterSelector.setConverter(celsiusToKelvinConverter);
        assertTestResult(273.15, converterSelector.convert(0), "Celsius to Kelvin test - Zero degrees");
    }

    public void celsiusToKelvinHundredTest() {
        converterSelector.setConverter("Celsius", "Kelvin");
        assertTestResult(373.15, converterSelector.convert(100), "Celsius to Kelvin test - 100 degrees");
    }

    public void fahrenheitToCelsiusZeroTest() {
        converterSelector.setConverter(fahrenheitToCelsiusConverter);
        assertTestResult(-17.77777777777778, converterSelector.convert(0), "Fahrenheit to Celsius test - Zero degrees");
    }

    public void fahrenheitToCelsiusHundredTest() {
        converterSelector.setConverter("Fahrenheit", "Celsius");
        assertTestResult(37.77777777777778, converterSelector.convert(100), "Fahrenheit to Celsius test - 100 degrees");
    }

    public void fahrenheitToKelvinZeroTest() {
        converterSelector.setConverter(fahrenheitToKelvinConverter);
        assertTestResult(255.3722222222222, converterSelector.convert(0), "Fahrenheit to Kelvin test - Zero degrees");
    }

    public void fahrenheitToKelvinHundredTest() {
        converterSelector.setConverter("Fahrenheit", "Kelvin");
        assertTestResult(310.92777777777775, converterSelector.convert(100), "Fahrenheit to Kelvin test - 100 degrees");
    }

    public void kelvinToCelsiusZeroTest() {
        converterSelector.setConverter(kelvinToCelsiusConverter);
        assertTestResult(273.15, converterSelector.convert(0), "Kelvin to Celsius test - Zero degrees");
    }

    public void kelvinToCelsiusHundredTest() {
        converterSelector.setConverter("Kelvin", "Celsius");
        assertTestResult(373.15, converterSelector.convert(100), "Kelvin to Celsius test - 100 degrees");
    }

    public void kelvinToFahrenheitZeroTest() {
        converterSelector.setConverter(kelvinToFahrenheitConverter);
        assertTestResult(523.67, converterSelector.convert(0), "Kelvin to Fahrenheit test - Zero degrees");
    }

    public void kelvinToFahrenheitHundredTest() {
        converterSelector.setConverter("Kelvin", "Fahrenheit");
        assertTestResult(703.67, converterSelector.convert(100), "Kelvin to Fahrenheit test - 100 degrees");
    }

    public void celsiusTemperatureZeroTest() {
        converterSelector.setConverter("Celsius", "Celsius");
        assertTestResult(0, converterSelector.convert(0), "Celsius temperature Zero test");
    }

    public void celsiusTemperatureHundredTest() {
        converterSelector.setConverter(celsiusTemperature);
        assertTestResult(0, converterSelector.convert(0), "Celsius temperature Hundred test");
    }

    public void kelvinTemperatureZeroTest() {
        converterSelector.setConverter("Kelvin", "Kelvin");
        assertTestResult(0, converterSelector.convert(0), "Kelvin temperature Zero test");
    }

    public void kelvinTemperatureHundredTest() {
        converterSelector.setConverter(kelvinTemperature);
        assertTestResult(100, converterSelector.convert(100), "Kelvin temperature Hundred test");
    }

    public void fahrenheitTemperatureZeroTest() {
        converterSelector.setConverter("Fahrenheit", "Fahrenheit");
        assertTestResult(0, converterSelector.convert(0), "Fahrenheit temperature Zero test");
    }

    public void fahrenheitTemperatureHundredTest() {
        converterSelector.setConverter(fahrenheitTemperature);
        assertTestResult(100, converterSelector.convert(100), "Fahrenheit temperature Hundred test");
    }

    private void assertTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }
}

