package students.ernests_subhankulovs.lesson_12.level_2.task_17;

class AccessDeniedException extends RuntimeException {
    AccessDeniedException() {
        super("Access denied!");
    }
    //RuntimeException and its subclasses are unchecked exceptions.
    //Unchecked exceptions do not need to be declared in a method or
    //constructor's throws clause if they can be thrown by the execution
    //of the method or constructor and propagate outside the method or
    //constructor boundary.
}