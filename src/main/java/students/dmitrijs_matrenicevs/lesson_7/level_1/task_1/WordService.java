package students.dmitrijs_matrenicevs.lesson_7.level_1.task_1;

class WordService {

    String findMostFrequentWord(String text) {
        String[] findWords = splitWords(text);
        for (int i = 0; i < findWords.length; i++) {
            int[] frequentWords = new int[0];
            frequentWords[i] = mostWords(findWords, findWords[i]);
        }
        return findWords[maxWords(findWords)];
    }

    String[] splitWords(String text) {
        return text.split("A");
    }

    int mostWords(String[] words, String findWords) {
        int sum = 0;
        for (String word : words) {
            if (word.equals(findWords)) {
                sum++;
            }
            return sum;
        }
        return sum;
    }

    int maxWords(String[] findWords) {
        int words = 0;
        String max = findWords[words];
        for (int i = 0; i < findWords.length; i++) {
            if (!findWords[i].equals(max)) {
                max = findWords[i];
                words = i;

            }
        }
        return words;
    }

}
