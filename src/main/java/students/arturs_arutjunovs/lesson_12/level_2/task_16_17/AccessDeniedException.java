package students.arturs_arutjunovs.lesson_12.level_2.task_16_17;
/*
   Класс RuntimeException выводиться из класса Exception.
   И все исключения идущие от RunTimeException - unchecked (непроверенные), а все остальные -
   checked.
   Проверенное исключение должно быть поймано в коде, иначе не будет компилироваться.
   Поэтому исключения которые компилятор заставляет нас обрабатывать, получены из
   java.lang.Exception, а все остальные которые можно не обрабатывать - из java.lang.RuntimeException.
    */
class AccessDeniedException extends Exception {

}