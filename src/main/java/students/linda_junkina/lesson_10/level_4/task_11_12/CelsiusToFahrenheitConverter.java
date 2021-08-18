package students.linda_junkina.lesson_10.level_4.task_11_12;

public class CelsiusToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
