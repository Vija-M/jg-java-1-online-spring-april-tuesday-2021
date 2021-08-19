package students.vija_m.lesson_12.level_2.task_13_14_15_16_17;

class AccessDeniedException extends Exception {
}

// класс AccessDeniedException в нашем случае лучше наследовать от Exception, а не от RuntimeException потому, что:
// в отличие от RuntimeException, Exception является проверенным исключением которое обрабатывается перед компиляцией