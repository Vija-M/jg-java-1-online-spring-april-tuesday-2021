package students.olga_saluna.lesson_10.level_1.task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin() {
        return canLogin("abcd", "qwerty123");
    }

    @Override
    public boolean canLogin(String login, String password) {
        return false;
    }
}

