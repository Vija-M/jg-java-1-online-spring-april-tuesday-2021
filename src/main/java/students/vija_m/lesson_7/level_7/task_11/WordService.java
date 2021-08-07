package students.vija_m.lesson_7.level_7.task_11;

class WordService {

    public String findMostFrequentWord(String text) {

        String[] textArray = splitStringToWords(text);
        int[] wordCountArray = new int[textArray.length];
        wordFrequency(textArray, wordCountArray);
        int max = mostFrequentWord(wordCountArray);
        return textArray[max];
    }

    private String[] splitStringToWords(String text) {
        return text.trim().split("([^A-Za-zА-ЯЁа-яё])+");
    }

    private void wordFrequency(String[] textArray, int[] wordCountArray) {


        for ( int wordCount = 0; wordCount < textArray.length; wordCount++ ) {
            int wordCounter = 0;
            for ( String i : textArray ) {
                if (textArray[wordCount].equals(i)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
        }
    }

    private int mostFrequentWord(int[] wordCountArray) {
        int maxValue = wordCountArray[0];
        int maxIndex = 0;
        for ( int i = 0; i < wordCountArray.length; i++ ) {
            if (wordCountArray[i] > maxValue) {
                maxValue = wordCountArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

