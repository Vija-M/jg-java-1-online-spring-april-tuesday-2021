package students.ernests_subhankulovs.lesson_7.level_7.task_14;


import java.util.UUID;

class UserRepositoryApplication {

    UserRepository userRepository = new UserRepository();

    public static void main(String[] args) {
        UserRepositoryApplication application = new UserRepositoryApplication();
        application.addNewUsers();
        application.printAllUsers();
    }

    public void addNewUsers() {
        UserEntity user1 = new UserEntity();
        user1.setFirstName("Zachary");
        user1.setLastName("Peterson");
        user1.setPersonalCode("66684565220");

        UserEntity user2 = new UserEntity();
        user2.setFirstName("Jarrett");
        user2.setLastName("Bates");
        user2.setPersonalCode("42432651636");

        UserEntity user3 = new UserEntity();
        user3.setFirstName("Jair");
        user3.setLastName("Dudley");
        user3.setPersonalCode("72505954901");

        UUID user1Id = userRepository.save(user1);
        UUID user2Id = userRepository.save(user2);
        UUID user3Id = userRepository.save(user3);
    }

    public void printAllUsers() {
        UserEntity[] users = userRepository.findAll();
        for (UserEntity user : users) {
            if (user != null) {
                System.out.println("User ID: " + user.getId());
                System.out.println("Personal Code: " + user.getPersonalCode());
                System.out.println("First Name: " + user.getFirstName());
                System.out.println("Last Name: " + user.getLastName());
                System.out.println();
            }
        }
    }
}