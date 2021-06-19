package students.eriks_jaloveckis.lesson_7.level_1;

class WordService {
    public String findMostFrequentWord(String text) {

        String[] words = splitWords(text);

        int[] numOfEqualWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            numOfEqualWords[i] = countOccurrences(words, words[i]);
        }

        return words[maxIndexed(numOfEqualWords)];
    }

    private String[] splitWords(String text) {
        return text.split("\\W+");
    }

    private int countOccurrences(String[] words, String wordToSearch) {
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToSearch)) {
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
