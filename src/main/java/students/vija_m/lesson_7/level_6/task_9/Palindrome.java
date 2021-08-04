package students.vija_m.lesson_7.level_6.task_9;

class Palindrome {
    boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll(" ", "");
        char[] arr = text.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++)
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        return true;
    }
}
