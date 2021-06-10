package students.ernests_subhankulovs.lesson_7.level_2.task_3;

class WordService {

    public String findMostFrequentWord(String text) {
        String [] words = divideStringToWords(text);
        Word[] repeatedWords = countWords(words);
        markDuplicates(repeatedWords);
        Word[] wordsWithoutDuplicates = removeDuplicates(repeatedWords, countDuplicates(repeatedWords));

        return findMostFrequentWord(wordsWithoutDuplicates);
    }

    private String[] divideStringToWords(String text) {
        return text.split("[,.\\s]+");
    }

    private Word[] countWords(String [] words) {
        Word[] repeatedWords = new Word[words.length];
        for (int i = 0; i < words.length; i++) {
            int wordCounter = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wordCounter++;
                }
            }
            repeatedWords[i] = new Word(words[i], wordCounter);
        }
        return repeatedWords;
    }

    private Word[] markDuplicates(Word[] repeatedWords) {
        for (int i = 0; i < repeatedWords.length; i++) {
            for (int j = 0; j < repeatedWords.length; j++) {
                if (i != j && repeatedWords[i].value.equals(repeatedWords[j].value)) {
                    repeatedWords[j].value = "REMOVE_ME";
                    repeatedWords[j].count = 0;
                }
            }
        }
        return repeatedWords;
    }

    private Word[] removeDuplicates(Word[] repeatedWords, int duplicates) {
        Word[] uniqueRepeatedWords = new Word[repeatedWords.length - duplicates];
        int uniqueCounter = 0;
        for (int i = 0; i < repeatedWords.length; i++) {
            if (!repeatedWords[i].value.equals("REMOVE_ME")) {
                uniqueRepeatedWords[uniqueCounter] = new Word(repeatedWords[i].value, repeatedWords[i].count);
                uniqueCounter++;
            }
        }
        return uniqueRepeatedWords;
    }

    private int countDuplicates(Word[] repeatedWords) {
        int duplicateCounter = 0;
        for (int i = 0; i < repeatedWords.length; i++) {
            if (repeatedWords[i].value.equals("REMOVE_ME")) {
                duplicateCounter++;
            }
        }
        return duplicateCounter;
    }

    private String findMostFrequentWord(Word[] wordsWithoutDuplicates) {
        String mostFrequentWord = "";
        int frequencyIndicator = 0;
        for (int i = 0; i < wordsWithoutDuplicates.length; i++) {
            if (wordsWithoutDuplicates[i].count > frequencyIndicator) {
                mostFrequentWord = wordsWithoutDuplicates[i].value;
                frequencyIndicator = wordsWithoutDuplicates[i].count;
            }
        }
        return mostFrequentWord;
    }

}
