package instructor.lesson_13;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator subject;

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
        subject = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @Test
    void should_2_plus_2_is_4() {
        assertEquals(4, subject.sum(2, 2));

        assertThat(subject.sum(2, 2))
                .isEqualTo(4).isPositive().isEven();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2, 4",
            "1, 3, 4",
            "3, 3, 6",
            "2, 3, 5",
            "5, 4, 9"
    })
    void should_sum(int a, int b, int expected) {
        assertEquals(expected, subject.sum(a, b));

        assertThat(subject.sum(a, b)).isEqualTo(expected);
    }

    @Test
    void should_throw_exception_on_foo() {

        assertThatThrownBy(() -> { subject.foo(); })
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Not implemented yet");

    }
}