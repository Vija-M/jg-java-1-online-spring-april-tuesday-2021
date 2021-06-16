package students.linda_junkina.lesson_7.level_1.task_1;

import java.util.Arrays;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = text.split("\\W+");
        Arrays.sort(words);
        String mostFrequentWord = "", previousWord = "";
        int maxCount = 0, count = 0;

        for (String word : words) {
            if (word.equals(previousWord)) {
                count += 1;
            } else {
                if (count > maxCount) {
                    mostFrequentWord = previousWord;
                    maxCount = count;
                }
                previousWord = word;
                count = 1;
            }
        }
        if (count > maxCount) {
            mostFrequentWord = previousWord;
        }
        return mostFrequentWord;

    }
}
