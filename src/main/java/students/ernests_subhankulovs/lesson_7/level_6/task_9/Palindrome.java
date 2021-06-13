package students.ernests_subhankulovs.lesson_7.level_6.task_9;

public class Palindrome {

    boolean isPalindrome(String text) {
        text = text.replaceAll(" ", "");
        for (int i = 0; i < text.length() / 2; i++) {
                int j = text.length() - i - 1;
                if (text.toLowerCase().charAt(i) != text.toLowerCase().charAt(j)) {
                    return false;
                }
        }
        return true;
    }

}
