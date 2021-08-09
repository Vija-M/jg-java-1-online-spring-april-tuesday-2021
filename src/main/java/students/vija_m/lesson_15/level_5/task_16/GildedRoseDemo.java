package students.vija_m.lesson_15.level_5.task_16;

import java.util.ArrayList;
import java.util.List;

class GildedRoseDemo {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        /*int days = 10;
        if(args.length > 0){
            days = Integer.parseInt(args[0])+1;
        }
        for(int i = 0; i < days; i++){
            System.out.println("-------- day " + i + "--------");
            System.out.println("name, selling, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            gildedRose.updateQuality(items);
        }*/
    }
}
