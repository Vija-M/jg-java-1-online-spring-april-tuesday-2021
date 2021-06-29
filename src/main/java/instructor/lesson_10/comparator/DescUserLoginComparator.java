package instructor.lesson_10.comparator;

import java.util.Comparator;

class DescUserLoginComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return -o1.getLogin().compareTo(o2.getLogin());
    }
}
