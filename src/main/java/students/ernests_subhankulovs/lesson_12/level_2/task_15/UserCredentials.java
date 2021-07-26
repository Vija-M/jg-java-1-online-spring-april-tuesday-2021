package students.ernests_subhankulovs.lesson_12.level_2.task_15;

import java.util.List;

class UserCredentials {
    private List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean containsRole(Role role) {
        return roles.contains(role);
    }
}
