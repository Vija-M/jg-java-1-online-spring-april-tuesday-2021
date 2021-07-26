package students.ernests_subhankulovs.lesson_11.level_4.task_27;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {
    Set<String> find(String text) {
        Set<String> wordsFound = new HashSet<>();
        String[] words = text.split("\\W+");
        Collections.addAll(wordsFound, words);
        return wordsFound;
    }
}
