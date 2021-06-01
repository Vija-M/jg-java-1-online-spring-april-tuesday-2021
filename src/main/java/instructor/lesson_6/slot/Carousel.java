package instructor.lesson_6.slot;

import java.util.Random;

class Carousel {

    static final String[] IMAGES = {"🍋", "🍒", "🍎", "🪓", "🍐", "🍑", "🥥", "🍊", "🍭"};

    String[] bars = new String[3];

    void spin() {
        for (int i = 0; i < bars.length; i++) {
            bars[i] = getRandomBar();
        }
    }

    void print() {
        System.out.print("👉 ");
        for (String bar : bars) {
            System.out.print(bar);
        }
        System.out.println(" 👈");
    }

    boolean isWin() {
        for (int i = 1; i < bars.length; i++) {
            if (!bars[i].equals(bars[i - 1])) {
                return false;
            }
        }
        return true;
    }

    String getRandomBar() {
        Random random = new Random();
        return IMAGES[random.nextInt(IMAGES.length)];
    }
}
