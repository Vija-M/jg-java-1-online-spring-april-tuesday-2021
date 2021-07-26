package students.dmitrijs_matrenicevs.lesson_12.level_2.task_7_17;

class AccessDeniedException extends Exception {

    public AccessDeniedException() {
        super("Forbidden!");
    }
    //Забыл на Task17 ответить:
    //Exception - Это объект, который обертывает событие ошибки, произошедшее в методе,
    //и содержит: Информацию об ошибке, включая ее тип. Состояние программы на момент возникновения ошибки. Он обрабатывается перед компилянией :3
}
