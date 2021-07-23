package students.ernests_subhankulovs.lesson_12.level_2.task_12;

import java.util.Arrays;
import java.util.List;

class UserCredentials {
    private List<Role> roles;

    UserCredentials() {
        this.roles = Arrays.asList(Role.values());
    }

    public List<Role> getRoles() {
        return roles;
    }
}
