package students.ernests_subhankulovs.lesson_12.level_6.task_37;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (!product.getTitle().trim().equals("")) {
            throw new ValidationException("Name validation rule #1", "Name cannot be blank!", "Name");
        }
        else if (product.getTitle().length() < 3) {
            throw new ValidationException("Name validation rule #2", "Name cannot be shorter than 3 symbols", "Name");
        }
        else if (product.getTitle().length() > 100) {
            throw new ValidationException("Name validation rule #3", "Name cannot be longer than 100 symbols", "Name");
        }
        else if (product.getTitle().matches("([A-Za-z0-9])\\w+")) {
            throw new ValidationException("Name validation rule #4", "Name can contain only English letters and numbers!", "Name");
        }
    }
}
