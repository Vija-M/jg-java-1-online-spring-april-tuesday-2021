package students.dmitriy_shukailo.lesson_3.level_7.task_26;

class TV {

    String brandTV;
    int sizeTV;
    boolean videoTV;
    boolean soundTV;
    int priceTV;

    TV(String brandTV, int sizeTV, boolean soundTV, boolean videoTV, int priceTV) {
        this.brandTV = brandTV;
        this.sizeTV = sizeTV;
        this.soundTV = soundTV;
        this.videoTV = videoTV;
        this.priceTV = priceTV;
    }

    void buyTV(){
        System.out.println("Brand         : " + brandTV);
        System.out.println("Size          : " + sizeTV + " inch ");
        System.out.println("Dolby TrueHD  : " + soundTV);
        System.out.println("DUltra HD     : " + videoTV);
        System.out.println("Price         : " + priceTV + " $ ");
    }

    void changeTV(String newBrandTV, int newSizeTV, boolean newSoundTV, boolean newVideoTV, int newPriceTV){
        brandTV = newBrandTV;
        sizeTV = newSizeTV;
        soundTV = newSoundTV;
        videoTV = newVideoTV;
        priceTV = newPriceTV;
    }






}
