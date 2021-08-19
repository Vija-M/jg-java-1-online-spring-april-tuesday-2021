package students.olga_t.lesson_4.level_6.task_16;

class Stock {
    String companyName;
    int actualPrice;
    int minPrice;
    int maxPrice;

    void updatePrice(int newPrice) {
        this.actualPrice = newPrice;
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        } else if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
    }

    String getPriceInformation() {
        return "Company = " + this.companyName + ", Current Price = " + this.actualPrice + " , Min Price = " + this.minPrice + " , Max Price = " + this.maxPrice;
    }

    Stock(String companyName, int actualPrice) {
        this.companyName = companyName;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

}



