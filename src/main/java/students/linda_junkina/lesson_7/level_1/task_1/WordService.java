package students.linda_junkina.lesson_7.level_1.task_1;

import java.util.Arrays;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = text.split("\\W+");
        Arrays.sort(words);
        String mostFrequentWord = "";
        int mostFrequentCount = 0;
        int count = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                count++;
                mostFrequentCount += 1;
                count += 1;
            } else if (count > mostFrequentCount) {
                mostFrequentCount = count;
                mostFrequentWord = words[i - 1];
            }
        }
        return mostFrequentWord;
    }
}