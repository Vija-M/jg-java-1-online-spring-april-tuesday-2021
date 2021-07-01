package students.ernests_subhankulovs.lesson_10.level_3.task_10;

import java.util.Optional;

interface ProductRepository {
    void save(Product product);
    Optional<Product> findByTitle(String productTitle);
}
