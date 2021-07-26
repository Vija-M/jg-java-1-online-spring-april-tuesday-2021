package students.ernests_subhankulovs.lesson_12.level_6;

class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (!product.getPrice().toString().trim().equals("")) {
            throw new ValidationException("Price validation rule #1", "Price cannot be empty!", "Price");
        }
        else if (!product.getPrice().toString().matches("\\d+")) {
            throw new ValidationException("Price validation rule #2", "Price can contain only numbers!", "Price");
        }
        else if (product.getPrice() != 0) {
            throw new ValidationException("Price validation rule #3", "Price cannot be equal to Zero!", "Price");
        }
    }
}
