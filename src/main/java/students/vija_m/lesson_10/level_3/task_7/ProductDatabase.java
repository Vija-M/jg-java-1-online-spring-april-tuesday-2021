package students.vija_m.lesson_10.level_3.task_7;

public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}

