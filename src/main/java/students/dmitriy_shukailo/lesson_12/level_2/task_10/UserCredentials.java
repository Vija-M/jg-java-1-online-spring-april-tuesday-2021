package students.dmitriy_shukailo.lesson_12.level_2.task_10;

import java.util.List;

class UserCredentials {

    private final List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles(){
        return roles;
    }

}