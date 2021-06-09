package students.ernests_subhankulovs.lesson_7.level_1.task_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String [] words = divideStringToWords(text);
        String[][] repeatedWords = countWords(words);
        markDuplicates(repeatedWords);
        String[][] wordsWithoutDuplicates = removeDuplicates(repeatedWords, countDuplicates(repeatedWords));

        return findMostFrequentWord(wordsWithoutDuplicates);
    }

    public String findMostFrequentWordExtended(String text) {
        String [] words = divideStringToWords(text);
        printAllWords(words);
        String[][] repeatedWords = countWords(words);
        printAllRepeatedWords(repeatedWords);
        markDuplicates(repeatedWords);
        System.out.println("Total duplicates: " + countDuplicates(repeatedWords));
        String[][] wordsWithoutDuplicates = removeDuplicates(repeatedWords, countDuplicates(repeatedWords));

        return findMostFrequentWord(wordsWithoutDuplicates);
    }

    private String[] divideStringToWords(String text) {
        return text.split("[,.\\s]+");
    }

    private String[][] countWords(String [] words) {
        String[][] repeatedWords = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int wordCounter = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wordCounter++;
                }
            }
            repeatedWords[i][0] = words[i];
            repeatedWords[i][1] = Integer.toString(wordCounter);
        }
        return repeatedWords;
    }

    private String[][] markDuplicates(String[][] repeatedWords) {
        for (int i = 0; i < repeatedWords.length; i++) {
            for (int j = 0; j < repeatedWords.length; j++) {
                if (i != j && repeatedWords[i][0].equals(repeatedWords[j][0])) {
                    repeatedWords[j][0] = "REMOVE_ME";
                    repeatedWords[j][1] = "REMOVE_ME";
                }
            }
        }
        return repeatedWords;
    }

    private String[][] removeDuplicates(String[][] repeatedWords, int duplicates) {
        String[][] uniqueRepeatedWords = new String[repeatedWords.length - duplicates][2];
        int uniqueCounter = 0;
        for (int i = 0; i < repeatedWords.length; i++) {
            if (!repeatedWords[i][0].equals("REMOVE_ME")) {
                uniqueRepeatedWords[uniqueCounter][0] = repeatedWords[i][0];
                uniqueRepeatedWords[uniqueCounter][1] = repeatedWords[i][1];
                uniqueCounter++;
            }
        }
        return uniqueRepeatedWords;
    }

    private int countDuplicates(String[][] repeatedWords) {
        int duplicateCounter = 0;
        for (int i = 0; i < repeatedWords.length; i++) {
            if (repeatedWords[i][0].equals("REMOVE_ME")) {
                duplicateCounter++;
            }
        }
        return duplicateCounter;
    }

    private String findMostFrequentWord(String[][] wordsWithoutDuplicates) {
        String mostFrequentWord = "";
        int frequencyIndicator = 0;
        for (int i = 0; i < wordsWithoutDuplicates.length; i++) {
            if (Integer.valueOf(wordsWithoutDuplicates[i][1]) > frequencyIndicator) {
                mostFrequentWord = wordsWithoutDuplicates[i][0];
                frequencyIndicator = Integer.valueOf(wordsWithoutDuplicates[i][1]);
            }
        }
        return mostFrequentWord;
    }

    private void printAllRepeatedWords(String[][] repeatedWords) {
        for (int i = 0; i < repeatedWords.length; i++) {
            System.out.println("Word: " + repeatedWords[i][0] + ";\trepeated: " + repeatedWords[i][1]);
        }
    }

    private void printAllWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
