package students.dmitriy_shukailo.lesson_15.level_1.task_3_4;

class WordsService {

    public int countRepetitions(String[] words, String iteratingWord) {
        int iterations = 0;
        for (String word : words) {
            if (word.equals(iteratingWord)) {
                iterations++;
            }
        }
        return iterations;
    }

}