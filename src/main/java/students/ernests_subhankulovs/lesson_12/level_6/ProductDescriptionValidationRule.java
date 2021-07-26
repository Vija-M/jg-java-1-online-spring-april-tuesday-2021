package students.ernests_subhankulovs.lesson_12.level_6;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() < 2000) {
            throw new ValidationException("Description validation rule #1", "Description cannot be longer than 2000 symbols!", "Description");
        }
        else if (product.getDescription().matches("([A-Za-z0-9])\\w+")) {
            throw new ValidationException("Description validation rule #2", "Description can contain only English letters and numbers!", "Description");
        }
    }
}
