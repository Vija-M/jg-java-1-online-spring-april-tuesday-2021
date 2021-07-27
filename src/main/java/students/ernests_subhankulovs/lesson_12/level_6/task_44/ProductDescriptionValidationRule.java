package students.ernests_subhankulovs.lesson_12.level_6.task_44;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() < 2000) {
            throw new ValidationException("RULE-7", "Description can not be longer than 2000 symbols", "description");
        }
        else if (product.getDescription().matches("([A-Za-z0-9])\\w+")) {
            throw new ValidationException("RULE-8", "Description can contain only English letters and numbers", "description");
        }
    }
}
