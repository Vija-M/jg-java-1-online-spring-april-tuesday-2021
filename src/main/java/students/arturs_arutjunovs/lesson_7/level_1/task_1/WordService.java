package students.arturs_arutjunovs.lesson_7.level_1.task_1;

class WordService {

    public String findMostFrequentWord(String text) {

        String[] words = text.split("\\W+");

        int[] numOfEqualWords = new int[words.length];
        int maxCount = 0;
        int index = 0;

        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (words[i].equals(words[j]))
                    numOfEqualWords[i]++;

        for (int i = 0; i < numOfEqualWords.length; i++)
            if (numOfEqualWords[i] > maxCount) {
                maxCount = numOfEqualWords[i];
                index = i;
            }
        return words[index];
    }
}
