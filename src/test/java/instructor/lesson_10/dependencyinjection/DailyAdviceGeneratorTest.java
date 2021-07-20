package instructor.lesson_10.dependencyinjection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

class DailyAdviceGeneratorTest {

    @Test
    void should_return_advice_by_bob_marley() {
        NumberGenerator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.nextInt(anyInt())).thenReturn(1);

        DailyAdviceGenerator subject = new DailyAdviceGenerator(numberGenerator);

        assertThat(subject.nextAdvice())
                .isEqualTo(new DailyAdvice("Don't worry - be happy! 😜", "Bob Marley"));

        verify(numberGenerator).nextInt(6);
    }
}