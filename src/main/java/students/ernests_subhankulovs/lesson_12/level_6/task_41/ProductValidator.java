package students.ernests_subhankulovs.lesson_12.level_6.task_41;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product) throws ValidationException;
}
