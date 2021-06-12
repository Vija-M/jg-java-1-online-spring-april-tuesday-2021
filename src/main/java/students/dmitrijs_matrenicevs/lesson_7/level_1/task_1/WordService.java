package students.dmitrijs_matrenicevs.lesson_7.level_1.task_1;

class WordService {

    String findMostFrequentWord(String text) {
       String [] findWords = splitWords(text);
        for (int i = 0; i < findWords.length; i++) {
            frequentWords[i] = mostWords(findWords, findWords[i]);
        }
        return findWords[maxWords(findWords)];
    }

    String[] splitWords(String text) {
        return text.split("A");
    }

    int mostWords(String[] words, String findWords){
        int sum = 0;
        for (String word : words){
            if (word.equals(findWords)){
                sum++;
            }
            return sum;
        }
    }

    int maxWords(int[] findWords) {
        int words = 0;
    }


}
