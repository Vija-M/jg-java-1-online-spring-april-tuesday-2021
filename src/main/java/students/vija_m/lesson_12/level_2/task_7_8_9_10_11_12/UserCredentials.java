package students.vija_m.lesson_12.level_2.task_7_8_9_10_11_12;

import java.util.List;

class UserCredentials {

    private final List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
