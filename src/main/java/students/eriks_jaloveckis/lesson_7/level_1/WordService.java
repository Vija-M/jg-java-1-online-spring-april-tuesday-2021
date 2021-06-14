package students.eriks_jaloveckis.lesson_7.level_1;

class WordService { // В ГОЛОВУ НЕ ПРИХОДИЛО РЕШЕНИЕ, ПОЭТОМУ ПРИШЛОСЬ БРАТЬ С ИНТЕРНЕТА
    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        int[] howMuch = new int[text.length()];    // каждому слову соответствует число одинаковых
        int maxCount = 0;                       // число макс кол-вал встречающихся
        int index = 0;                          // последний индекс с макс.
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (words[i].equals(words[j])) howMuch[i]++; // заполним массив
        for (int i = 0; i < howMuch.length; i++)
            if (howMuch[i] > maxCount) {
                maxCount = howMuch[i];                  // найдем макс.
                index = i;                              // найдем индекс с макс.
            }
        return words[index];
    }
}
