package students.ernests_subhankulovs.lesson_7.level_7.task_11;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = splitTextToWords(text);
        int[] wordRepetitions = new int[words.length];

        calculateWordFrequency(words, wordRepetitions);
        int mostFrequentWordNumber = detectMostRepeatedWord(wordRepetitions);

        return words[mostFrequentWordNumber];
    }

    private String[] splitTextToWords(String text) {
        return text.split("[,.()\\-\\s*]+");
    }

    private void calculateWordFrequency(String[] words, int[] wordRepetitions) {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < words.length; wordCount++) {
            for (String word : words) {
                if (words[wordCount].equals(word)) {
                    wordCounter++;
                }
            }
            wordRepetitions[wordCount] = wordCounter;
            wordCounter = 0;
        }
    }

    private int detectMostRepeatedWord(int[] wordRepetitions) {
        int max = 0;
        for (int count = 0; count < wordRepetitions.length; count++) {
            if (wordRepetitions[count] > max) {
                max = count;
            }
        }
        return max;
    }
}
