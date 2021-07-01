package students.ernests_subhankulovs.lesson_10.level_3.task_11;

class FahrenheitTemperature implements Temperature {
    @Override
    public double calculateTemperature(double temperatureInCelsius) {
        return temperatureInCelsius * (9.0 / 5.0) + 32;
    }
}
