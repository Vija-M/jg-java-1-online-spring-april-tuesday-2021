package students.ernests_subhankulovs.lesson_12.level_6.task_47;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle().trim().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be blank", "title");
        }
        else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be shorter than 3 symbols", "title");
        }
        else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title");
        }
        else if (!product.getTitle().matches("([A-Za-z0-9])\\w+")) {
            throw new ValidationException("RULE-4", "Title can contain only English letters and numbers", "title");
        }
    }
}
