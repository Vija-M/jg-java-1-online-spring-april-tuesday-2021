package students.ernests_subhankulovs.lesson_12.level_5.task_34;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    @Override
    public List<ValidationException> validate(Product product) throws ValidationException {
        List<ValidationException> exceptionList = new ArrayList<>();
        if (!product.getTitle().trim().equals("")) {
            exceptionList.add(new ValidationException("Name validation rule #1", "Name cannot be blank!", "Name"));
        }
        else if (product.getTitle().length() < 3) {
            exceptionList.add(new ValidationException("Name validation rule #2", "Name cannot be shorter than 3 symbols", "Name"));
        }
        else if (product.getTitle().length() > 100) {
            exceptionList.add(new ValidationException("Name validation rule #4", "Name cannot be longer than 100 symbols", "Name"));
        }
        else if (product.getTitle().matches("([A-Za-z0-9])\\w+")) {
            exceptionList.add(new ValidationException("Name validation rule #5", "Name can contain only English letters and numbers!", "Name"));
        }
        else if (!product.getPrice().toString().trim().equals("")) {
            exceptionList.add(new ValidationException("Price validation rule #1", "Price cannot be empty!", "Price"));
        }
        else if (!product.getPrice().toString().matches("\\d+")) {
            exceptionList.add(new ValidationException("Price validation rule #2", "Price can contain only numbers!", "Price"));
        }
        else if (product.getPrice() != 0) {
            exceptionList.add(new ValidationException("Price validation rule #3", "Price cannot be equal to Zero!", "Price"));
        }
        else if (product.getDescription().length() < 2000) {
            exceptionList.add(new ValidationException("Description validation rule #1", "Description cannot be longer than 2000 symbols!", "Description"));
        }
        else if (product.getDescription().matches("([A-Za-z0-9])\\w+")) {
            exceptionList.add(new ValidationException("Description validation rule #2", "Description can contain only English letters and numbers!", "Description"));
        }
        return exceptionList;
    }
}
