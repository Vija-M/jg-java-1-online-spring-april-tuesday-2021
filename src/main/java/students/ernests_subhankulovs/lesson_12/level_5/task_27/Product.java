package students.ernests_subhankulovs.lesson_12.level_5.task_27;

class Product {
    private String name;
    private double price;
    private String description;

    Product(String name, double price, String description) throws InvalidNameException, InvalidPriceException, InvalidDescriptionException {
        if (!name.trim().equals("") && name.length() >= 3 && name.length() <= 100 && name.matches("([A-Za-z0-9])\\w+")) {
            this.name = name;
        }
        else {
            throw new InvalidNameException();
        }
        if (price > 0) {
            this.price = price;
        }
        else {
            throw new InvalidPriceException();
        }
        if (description.length() < 2000 && description.matches("([A-Za-z0-9])\\\\w+")) {
            this.description = description;
        }
        else {
            throw new InvalidDescriptionException();
        }
    }
}
