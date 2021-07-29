package students.arturs_arutjunovs.lesson_12.level_2.task_15;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
