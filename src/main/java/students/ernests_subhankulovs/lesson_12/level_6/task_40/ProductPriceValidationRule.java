package students.ernests_subhankulovs.lesson_12.level_6.task_40;

class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (!product.getPrice().toString().trim().equals("")) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }
        else if (product.getPrice() != 0) {
            throw new ValidationException("RULE-6", "Price can not be equal to Zero", "price");
        }
    }
}
