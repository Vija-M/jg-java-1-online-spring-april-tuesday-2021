package students.ernests_subhankulovs.lesson_10.level_4.task_12;

class CelsiusToFahrenheitConverter implements TemperatureConverter  {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
