package students.dmitrijs_matrenicevs.lesson_12.level_2.task_7_17;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
