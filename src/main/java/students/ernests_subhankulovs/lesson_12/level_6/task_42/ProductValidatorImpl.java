package students.ernests_subhankulovs.lesson_12.level_6.task_42;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    private ProductTitleValidationRule titleValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule) {
        this.titleValidationRule = titleValidationRule;
    }

    public ProductValidatorImpl() {

    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

    public void setTitleValidationRule(ProductTitleValidationRule titleValidationRule) {
        this.titleValidationRule = titleValidationRule;
    }
}
