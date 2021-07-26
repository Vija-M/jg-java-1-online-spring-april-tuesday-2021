package students.ernests_subhankulovs.lesson_12.level_6;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    @Override
    public List<ValidationException> validate(Product product) throws ValidationException {
        List<FieldValidationRule> validationRules = new ArrayList<>();
        validationRules.add(new ProductTitleValidationRule());
        validationRules.add(new ProductPriceValidationRule());
        validationRules.add(new ProductDescriptionValidationRule());
        List<ValidationException> exceptionList = new ArrayList<>();
        for (FieldValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            }
            catch (ValidationException e) {
                exceptionList.add(e);
            }
        }
        return exceptionList;
    }
}
