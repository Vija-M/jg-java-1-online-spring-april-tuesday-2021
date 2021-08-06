package students.linda_junkina.lesson_15.level_1.task_3_4;

class WordService {
    public int countRepetitions(String[] words, String repeatingWord) {
        int counter = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                counter++;
            }
        }
        return counter;
    }
}
