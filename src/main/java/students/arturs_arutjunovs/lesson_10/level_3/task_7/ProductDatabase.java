package students.arturs_arutjunovs.lesson_10.level_3.task_7;

//Нижеприведенный интерфейс не является функциональным, хотя бы потому что имеет два метода,
//и не static
interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);
}

class Product {

    private final String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}

