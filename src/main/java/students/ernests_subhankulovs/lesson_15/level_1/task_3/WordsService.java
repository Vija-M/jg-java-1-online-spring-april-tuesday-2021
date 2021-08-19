package students.ernests_subhankulovs.lesson_15.level_1.task_3;

class WordsService {

    public int countRepetitions(String[] words, String repeatedWord) {
        int repeatedWordCount = 0;
        for (String word : words) {
            if (word.equals(repeatedWord)) {
                repeatedWordCount++;
            }
        }
        return repeatedWordCount;
    }

}
