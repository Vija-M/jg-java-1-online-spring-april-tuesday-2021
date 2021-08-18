package students.linda_junkina.lesson_10.level_4.task_11_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelsiusConverterTest {
    CelsiusToKelvinConverter kelvinConverter = new CelsiusToKelvinConverter();
    CelsiusToFahrenheitConverter fahrenheitConverter = new CelsiusToFahrenheitConverter();

    @Test
    void celsiusToKelvin0() {
        assertEquals(273.15, kelvinConverter.convert(0));
    }

    @Test
    void celsiusToKelvinMinus1() {
        assertEquals(272.15, kelvinConverter.convert(-1));
    }

    @Test
    void celsiusToKelvin50() {
        assertEquals(274.15, kelvinConverter.convert(1));
    }

    @Test
    void celsiusToFahrenheit0() {
        assertEquals(32, fahrenheitConverter.convert(0));
    }

    @Test
    void celsiusToFahrenheitMinus1() {
        assertEquals(30.2, fahrenheitConverter.convert(-1));
    }

    @Test
    void celsiusToFahrenheit100() {
        assertEquals(33.8, fahrenheitConverter.convert(1));
    }
}