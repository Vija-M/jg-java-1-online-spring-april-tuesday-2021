package students.vija_m.lesson_9.level_2.task_8;


class ProtectedClass {

    private String title;
    private String author;

// Модификаторы доступа Protected чем-то схож с Default (package private)
// Видимость данных и методов: в пределах всех классов, находящихся в том же пакете.
// С той только разницей, что в отличии от Default также он виден и в пределах всех классов-наследников нашего класса.
// Так-как неизвестно какие именно класссы будут являться наследниками нашего класса, то нет смысла обьявлять его Protected - логичнее использовать Default (package private).
}