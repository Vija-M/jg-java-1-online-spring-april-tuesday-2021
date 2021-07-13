package students.vija_m.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //ArrayList и LinkedList являются классами Collection, и оба они реализуют интерфейс List.
        List<String> guests = new ArrayList<>();
        guests.add("Петров");
        guests.add("Иванов");
        guests.add(0, "Сидоров");
        System.out.println("Total guests invited: " + guests.size());
        System.out.println("List of planed guests: " + guests);
        guests.add("Петров");
        guests.set(2, "Krūmiņš");
        System.out.println("Updates. Total guests invited: " + guests.size());
        System.out.println("List of my guests: " + guests);
        System.out.println();

        //ArrayList реализует интерфейс List с помощью динамического массива перераспределения (это динамический (растущий) массив).

        List<String> whatToCook = new LinkedList<>();
        whatToCook.add("лимонад");
        whatToCook.add("канапе");
        whatToCook.add("корзиночки с сырным салатом");
        whatToCook.add("рулетики");
        whatToCook.add("стэйки");
        whatToCook.add("овощи гриль");
        whatToCook.add("десерт");
        System.out.println("For my party I plan to cook: " + whatToCook);
        whatToCook.add(0, "ТОРТ");
        whatToCook.set(1, "коктейли");
        System.out.println("For my party I will cook: " + whatToCook);
        /*  LinkedList реализует интерфейс List с двусвязным списком.
        ArrayList - это более простая структура данных, чем LinkedList.
        Операция поиска в LinkedList проходит медленнее, чем ArrayList потому,
        что ArrayList может быстро найти элемент по индексу, в то время как LinkedList не имеет индексов
        для непосредственного доступа к элементам и должен пройти весь список для нахождения одного элементу из списка.
        LinkedList работает быстрее при записывании, добавлении, перемещении элементов, так как ему не требуется
        дополнительное время на изменение длинны списка.
         */
    }
}


