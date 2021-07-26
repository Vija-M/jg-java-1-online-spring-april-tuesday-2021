package students.ernests_subhankulovs.lesson_10.level_7.task_27;

class KelvinToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double kelvinTemperature) {
        return kelvinTemperature + 273.15;
    }
}