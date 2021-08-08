package students.vija_m.lesson_15.level_1.task_3;

class WordsService {
    int countRepetitions(String[] words, String repeatingWord) {
        int repetitions = 0;
        for ( String word : words ) {
            if (word.equals(repeatingWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }
}
