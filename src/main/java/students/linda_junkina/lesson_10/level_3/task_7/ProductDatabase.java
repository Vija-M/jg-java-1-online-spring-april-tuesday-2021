package students.linda_junkina.lesson_10.level_3.task_7;


interface ProductDatabase {
    void save(Product product);
    Product findByTitle(String productTitle);
}
// Интерфейс не является функциональным (т.к. 2 метода)