package students.eriks_jaloveckis.lesson_10.level_3.task_8;

interface ProductRepository {

    void save(Product product);

    Product findByTitle(String productTitle);
}
