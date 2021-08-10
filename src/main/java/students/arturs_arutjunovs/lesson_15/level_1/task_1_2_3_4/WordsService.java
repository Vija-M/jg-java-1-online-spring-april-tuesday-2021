package students.arturs_arutjunovs.lesson_15.level_1.task_1_2_3_4;

class WordsService {
    public int countRepetitions(String[] words, String mostFrequentWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(mostFrequentWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }
}
