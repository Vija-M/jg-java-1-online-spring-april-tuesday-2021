package students.dmitrijs_matrenicevs.lesson_14.level_2.task_7_17;

import java.util.Objects;

class Apple {

    private final String color;
    private final int weight;
    public String getColor;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (this == obj) {
            result = true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                result = false;
            } else {
                var apple = (Apple) obj;
                result = (weight == apple.weight) && Objects.equals(color, apple.color);
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
