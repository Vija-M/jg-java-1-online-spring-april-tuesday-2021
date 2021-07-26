package students.arturs_arutjunovs.lesson_11.level_1.task_1;
//Наиболее часто употребляемая реализация интерфейса java.util.List - ArrayList,
// другая альтернативная реализация интерфейса - LinkedList.

//Главные отличия в том что ArrayList - это список на основе обычного массива, а LinkedList
//связанный список на основе элементов(узлов), связующиеся между собой (linked).

//В каждом узле, хранятся ссылки на следующий/предыдующий узел и значение.

//Вставка элемента в LinkedList: находится элемент, за которым должен следовать вставляемый элемент,
// изменяются ссылки в нем и следующим за ним.

//В ArrayList: если в текущем массиве нет места, создается новый массив, элементы которые находятся до вставляемого,
// остаются на месте, или копируются в новый.
// Далее добавляется вставляемый элемент. Затем копируются оставщиеся элементы, которые были в исходном массиве.

//LinkedList предпочтителен когда предполагается частое удаление или вставка, в этом плане он работает
//быстрее чем ArrayList, но у последнего быстрее доступ к элементам массива.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class JavaUtilDemo {
    public static void main(String[] args) {

        List<String> workList = new LinkedList<>();
        workList.add("fix");
        workList.add("wash");
        workList.add("clean");
        workList.size();

        System.out.println("workList before = " + workList);
        System.out.println("workList size() = " + workList.size());

        workList.add(1, "cut");
        System.out.println("workList after = " + workList);
        System.out.println("workList size() = " + workList.size());
        System.out.println();

        List<String> shopList = new ArrayList<>();
        shopList.add(0, "Milk");
        shopList.add(1, "Meat");
        System.out.println("shopList before = " + shopList);
        System.out.println("shopList size = " + shopList.size());
        shopList.add(1, "Bread"); //replace index 1 with element "Bread"
        System.out.println("shopList after = " + shopList);
        System.out.println("shopList size = " + shopList.size());
        System.out.println();

        workList.clear();
        shopList.clear();
        System.out.println("Both lists are clear:" + workList + "" + shopList);


    }
}