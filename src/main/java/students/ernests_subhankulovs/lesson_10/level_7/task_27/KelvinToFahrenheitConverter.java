package students.ernests_subhankulovs.lesson_10.level_7.task_27;

class KelvinToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double kelvinTemperature) {
        return 1.8 * (kelvinTemperature + 273.15) + 32;
    }
}