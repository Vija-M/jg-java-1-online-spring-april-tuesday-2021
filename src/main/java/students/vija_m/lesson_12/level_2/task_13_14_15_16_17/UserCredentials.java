package students.vija_m.lesson_12.level_2.task_13_14_15_16_17;

import java.util.List;

class UserCredentials {

    private final List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
