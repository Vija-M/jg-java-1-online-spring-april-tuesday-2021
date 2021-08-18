package students.linda_junkina.lesson_7.level_2.task_3;

import java.util.Arrays;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = text.split("\\W+");
        Arrays.sort(words);
        String mostFrequentWord = "", previousMostFrequentWord = "";
        int maxCount = 0, count = 0;

        for (String word : words)
            if (word.equals(previousMostFrequentWord)) {
                count += 1;
            } else {
                if (count > maxCount) {
                    mostFrequentWord = previousMostFrequentWord;
                    maxCount = count;
                }
                previousMostFrequentWord = word;
                count = 1;
            }
        if (count > maxCount) {
            mostFrequentWord = previousMostFrequentWord;
        }
        return mostFrequentWord;
    }
}
