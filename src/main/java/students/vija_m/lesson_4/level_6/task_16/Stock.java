package students.vija_m.lesson_4.level_6.task_16;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;


    /*
    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice){
        if ( newPrice > currentPrice && newPrice > maxPrice) {
            this.maxPrice = newPrice;
        }
        else if ( newPrice < currentPrice && newPrice < minPrice) {
            this.minPrice = newPrice;
        }
                this.currentPrice = newPrice;
        }

String getPriceInformation() {
return "Company = " + companyName + " , Current Price = " + currentPrice + " , Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

}
