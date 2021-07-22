package students.ernests_subhankulovs.lesson_11.level_4.task_27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {

    Assertions assertions = new Assertions();

    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.findTest();
    }

    public void findTest() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String testText = "One Two Two Three Three Three";
        Set<String> wordsFound = uniqueWordFinder.find(testText);
        Set<String> wordsToBeFound = new HashSet<>();
        wordsToBeFound.add("One");
        wordsToBeFound.add("Two");
        wordsToBeFound.add("Three");
        assertions.assertSetTestResult(wordsToBeFound, wordsFound, "Unique words are found correctly");
    }
}
