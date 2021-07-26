package students.ernests_subhankulovs.lesson_12.level_5.task_33;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
