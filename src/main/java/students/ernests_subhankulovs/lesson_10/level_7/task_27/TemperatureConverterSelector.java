package students.ernests_subhankulovs.lesson_10.level_7.task_27;

class TemperatureConverterSelector {
    private String initialTemperatureScale;
    private String resultingTemperatureScale;
    private TemperatureConverter converter;

    public TemperatureConverterSelector(String initialTemperatureScale, String resultingTemperatureScale) {
        this.initialTemperatureScale = initialTemperatureScale;
        this.resultingTemperatureScale = resultingTemperatureScale;
    }

    public TemperatureConverterSelector(TemperatureConverter converter) {
        this.converter = converter;
    }

    public void setConverter(TemperatureConverter converter) {
        this.converter = converter;
    }

    public void setConverter(String initialTemperatureScale, String resultingTemperatureScale) {
        this.initialTemperatureScale = initialTemperatureScale;
        this.resultingTemperatureScale = resultingTemperatureScale;
        this.converter = selectConverter();

    }

    public double convert(double temperature) {
        return converter.convert(temperature);
    }

    private TemperatureConverter selectConverter() {
        switch (initialTemperatureScale) {
            case ("Celsius") -> {
                return switch (resultingTemperatureScale) {
                    case ("Fahrenheit") -> new CelsiusToFahrenheitConverter();
                    case ("Kelvin") -> new CelsiusToKelvinConverter();
                    default -> new CelsiusTemperature();
                };
            }
            case ("Fahrenheit") -> {
                return switch (resultingTemperatureScale) {
                    case ("Celsius") -> new FahrenheitToCelsiusConverter();
                    case ("Kelvin") -> new FahrenheitToKelvinConverter();
                    default -> new FahrenheitTemperature();
                };
            }
            case ("Kelvin") -> {
                return switch (resultingTemperatureScale) {
                    case ("Celsius") -> new KelvinToCelsiusConverter();
                    case ("Fahrenheit") -> new KelvinToFahrenheitConverter();
                    default -> new KelvinTemperature();
                };
            }
            default -> {
                return new CelsiusTemperature();
            }
        }
    }
}
