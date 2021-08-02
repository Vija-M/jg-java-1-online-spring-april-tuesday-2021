package students.dmitrijs_matrenicevs.lesson_14.level_1.task_1_6;

import java.util.Objects;

class Apple {

    private final String color;
    private final int weight;

    public Apple (String color, int weight) {
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
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Apple apple = (Apple) obj;
        return weight == apple.weight && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
