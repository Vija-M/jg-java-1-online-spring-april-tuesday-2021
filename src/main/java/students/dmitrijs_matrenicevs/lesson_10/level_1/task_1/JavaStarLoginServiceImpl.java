package students.dmitrijs_matrenicevs.lesson_10.level_1.task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("avatar")
                && (password != null)
                && password.equals("pass");
    }
}
