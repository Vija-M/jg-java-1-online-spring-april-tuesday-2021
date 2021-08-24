package students.ernests_subhankulovs.lesson_15.level_5.task_16.gildedrose;

import java.util.List;

class GildedRose {

	public void updateQuality(List<Item> items) {
		for (Item item : items) {
			if ((!"Aged Brie".equals(item.getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(item.getName())
			&& item.getQuality() > 0 && !"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
				item.setQuality(item.getQuality() - 1);
			}

			if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);
					if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())
							&& (item.getSellIn() < 11 && item.getQuality() < 50)
							|| (item.getSellIn() < 6 && item.getQuality() < 50)) {
								item.setQuality(item.getQuality() + 1);
					}
			}

			if (!"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
				item.setSellIn(item.getSellIn() - 1);
			}

			if (item.getSellIn() < 0 && !"Aged Brie".equals(item.getName())) {
				if (!"Backstage passes to a TAFKAL80ETC concert".equals(item.getName()) && item.getQuality() > 0
						&& !"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
					item.setQuality(item.getQuality() - 1);
				} else {
					item.setQuality(0);
				}
			}

			if (item.getQuality() < 50  && !"Aged Brie".equals(item.getName())) {
				item.setQuality(item.getQuality() + 1);
			}
		}
	}
}