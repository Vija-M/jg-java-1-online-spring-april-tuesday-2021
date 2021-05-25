package instructor.lesson_5.advice;

import java.util.Random;

class DailyAdvice {

    String getAdvice() {
        String[] advices = {
                "Always wash your hands 🧼",
                "Don't worry - be happy! 😜",
                "Take it easy",
                "Treat yourself",
                "No pain, no gain 💪",
                "Never give up 😤",
                "xxx",
                "yyy",
                "zzz"
        };

        Random random = new Random();
        int idx = random.nextInt(advices.length);

        return advices[idx];
    }
}
