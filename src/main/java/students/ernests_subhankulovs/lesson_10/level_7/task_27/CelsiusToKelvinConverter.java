package students.ernests_subhankulovs.lesson_10.level_7.task_27;

class CelsiusToKelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
