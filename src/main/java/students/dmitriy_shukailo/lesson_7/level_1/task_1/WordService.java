package students.dmitriy_shukailo.lesson_7.level_1.task_1;

class WordService {

    public String findMostFrequentWord(String text) {

        String[] words = splitWords(text);
        int[] equalWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            equalWords[i] = countEqualWords(words, words[i]);
        }
        return words[maxIndexed(equalWords)];
    }

    String[] splitWords(String text) {

        return text.split("\\W+");
    }

    private int countEqualWords(String[] words, String findWords) {

        int count = 0;
        for (String word : words) {
            if (word.equals(findWords)) {
                count++;
            }
        }
        return count;
    }

    private int maxIndexed(int[] numbers) {

        int index = 0;
        int max = numbers[index];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        return index;
    }

}