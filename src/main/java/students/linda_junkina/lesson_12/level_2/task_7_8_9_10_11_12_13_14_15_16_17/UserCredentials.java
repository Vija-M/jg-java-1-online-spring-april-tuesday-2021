package students.linda_junkina.lesson_12.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.List;

class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    // Task15
    public boolean roleProvided(Role role) {
        return roles.contains(role);
    }
}
