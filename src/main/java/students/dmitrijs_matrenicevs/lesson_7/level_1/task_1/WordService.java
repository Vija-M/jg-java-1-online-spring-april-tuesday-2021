package students.dmitrijs_matrenicevs.lesson_7.level_1.task_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] findWords = splitWords(text);

        int[] mostWords = new int[findWords.length];
        for (int i = 0; i < findWords.length; i++) {
            mostWords[i] = mostWords(findWords, findWords[i]);
        }
        return findWords[maxWords(mostWords)];
    }

    String[] splitWords(String text) {

        return text.split("\\W+");

    }

    private int mostWords(String[] words, String findWords) {
        int count = 0;
        for (String word : words) {
            if (word.equals(findWords)) {
                count++;
            }
        }
        return count;

    }

    private int maxWords(int[] findWords) {
        int words = 0;
        int max = findWords[words];
        for (int i = 0; i < findWords.length; i++) {
            if (findWords[i] > max) {
                max = findWords[i];
                words = i;
            }
        }
        return words;
    }
}
