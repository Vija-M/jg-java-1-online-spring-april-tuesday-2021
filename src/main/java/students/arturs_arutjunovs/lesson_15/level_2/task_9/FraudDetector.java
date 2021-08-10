package students.arturs_arutjunovs.lesson_15.level_2.task_9;
//Судя по всему автор предполагал что транзакция пользователя с именем Pokemon, или так же
// исходящая из города Sidney, является мошеннической

class FraudDetector {

    boolean isFraud(Trader trader) {
        String traderName = trader.getName();
        String cityName = trader.getCity();
        return traderName.equals("Pokemon") || cityName.equals("Sidney");
    }
}

