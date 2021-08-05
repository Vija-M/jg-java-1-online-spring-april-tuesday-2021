package students.vija_m.lesson_7.level_7.task_11;

class WordService {

    public String findMostFrequentWord(String text) {

        String[] textArray = splitStringToWords(text);
        int[] wordCountArray = new int[textArray.length];
        wordFrequency(textArray, wordCountArray);
        int max = mostFrequenWord(wordCountArray);
        return textArray[max];
    }

    private String[] splitStringToWords(String text) {
        return text.split("([^A-Za-zА-ЯЁа-яё])+");
    }

    private void wordFrequency(String[] textArray, int[] wordCountArray) {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
    }

    private int mostFrequenWord(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }
}