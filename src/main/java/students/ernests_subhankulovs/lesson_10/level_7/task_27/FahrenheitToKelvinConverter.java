package students.ernests_subhankulovs.lesson_10.level_7.task_27;

public class FahrenheitToKelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8 + 273.15;
    }
}