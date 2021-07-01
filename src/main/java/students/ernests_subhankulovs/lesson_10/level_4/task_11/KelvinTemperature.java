package students.ernests_subhankulovs.lesson_10.level_4.task_11;

class KelvinTemperature implements Temperature{
    @Override
    public double calculateTemperature(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
    }
}
