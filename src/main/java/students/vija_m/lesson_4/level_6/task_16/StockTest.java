package students.vija_m.lesson_4.level_6.task_16;

class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.scenario1();
        testRunner.scenario2();
        testRunner.scenario3();
        testRunner.scenario4();
        testRunner.scenario5();
        testRunner.scenario6();
    }

    void scenario1() {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println("Start values:");
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertTest(27, google.currentPrice, 27, google.maxPrice, 9, google.minPrice, "stock value test of \"Google\"");
    }

    void scenario2() {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println("Start values:");
        System.out.println(priceInformation);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertTest(77, google.currentPrice, 99, google.maxPrice, 5, google.minPrice, "stock value test of \"Google\"");
    }

    void scenario3() {
        Stock google = new Stock("GOOG", 999);
        String priceInformation = google.getPriceInformation();
        System.out.println("Start values:");
        System.out.println(priceInformation);
        google.updatePrice(1);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertTest(1, google.currentPrice, 999, google.maxPrice, 1, google.minPrice, "stock value test of \"Google\"");
    }

    void scenario4() {
        Stock google = new Stock("GOOG", 999);
        String priceInformation = google.getPriceInformation();
        System.out.println("Start values:");
        System.out.println(priceInformation);
        google.updatePrice(2);
        google.updatePrice(1000);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertTest(1000, google.currentPrice, 1000, google.maxPrice, 2, google.minPrice, "stock value test of \"Google\"");
    }

    void scenario5() {
        Stock google = new Stock("GOOG", 999);
        String priceInformation = google.getPriceInformation();
        System.out.println("Start values:");
        System.out.println(priceInformation);
        google.updatePrice(2);
        google.updatePrice(1000);
        google.updatePrice(8);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertTest(8, google.currentPrice, 1000, google.maxPrice, 2, google.minPrice, "stock value test of \"Google\"");
    }

    void scenario6() {
        Stock google = new Stock("GOOG", 9);
        String priceInformation = google.getPriceInformation();
        System.out.println("Start values:");
        System.out.println(priceInformation);
        google.updatePrice(27);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertTest(27, google.currentPrice, 27, google.maxPrice, 9, google.minPrice, "stock value test of \"Google\"");
    }


    void assertTest(int expectedCurrentPrice, int actualCurrentPrice, int expectedMaxPrice, int actualMaxPrice, int expectedMinPrice, int actualMinPrice, String description) {
        if (expectedCurrentPrice == actualCurrentPrice) {
            System.out.println("[ OK ]: Current " + description);
        } else {
            System.out.println("[FAIL]: Current" + description + ". Expected " + expectedCurrentPrice + ", but was " + actualCurrentPrice);
        }
        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("[ OK ]: Max " + description);
        } else {
            System.out.println("[FAIL]: Max" + description + ". Expected " + expectedMaxPrice + ", but was " + actualMaxPrice);
        }
        if (expectedMinPrice == actualMinPrice) {
            System.out.println("[ OK ]: Min " + description);
        } else {
            System.out.println("[FAIL]: Min" + description + ". Expected " + expectedMinPrice + ", but was " + actualMinPrice);
        }
        System.out.println("***");
    }
}





