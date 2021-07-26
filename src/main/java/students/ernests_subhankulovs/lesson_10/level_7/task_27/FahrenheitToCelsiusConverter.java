package students.ernests_subhankulovs.lesson_10.level_7.task_27;

public class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double fahrenheitTemperature) {
//        System.out.println("OVER HERE!!!");
//        System.out.println((fahrenheitTemperature - 32) / 1.8);
        return (fahrenheitTemperature - 32) / 1.8;
    }
}
