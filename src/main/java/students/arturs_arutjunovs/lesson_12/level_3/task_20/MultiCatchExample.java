package students.arturs_arutjunovs.lesson_12.level_3.task_20;
//Находясь в одном и том же блоке try, по большому счету можно обойтись без блока
//catch(ArithmeticException a), так как (Exception) стоит в иерархии исключений
// над ArithmeticException

class MultiCatchExample {
    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {
        }
    }
}