package students.vija_m.lesson_7.level_1.task_1;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = divideStringToWords(text);
        int[] numOfEqualWords = new int[words.length];    // каждому слову соответствует число употреблений
        int maxCount = 0;                       // число макс кол-вал встречающихся слов
        int index = 0;                          // последний индекс с макс.
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (words[i].equals(words[j])) {
                    numOfEqualWords[i]++;
                } // заполним массив
        for (int i = 0; i < numOfEqualWords.length; i++)
            if (numOfEqualWords[i] > maxCount) {
                maxCount = numOfEqualWords[i];                  // найдем макс.
                index = i;                              // найдем индекс с макс.
            }
        return words[index];

    }

    private String[] divideStringToWords(String text) {
        return text.split("\\W+");
    }


}

