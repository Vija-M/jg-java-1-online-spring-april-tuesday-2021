package students.ernests_subhankulovs.lesson_7.level_7.task_14;

import java.util.UUID;

class UserRepositoryTest {
    public static void main(String[] args) {
        UserRepositoryTest test = new UserRepositoryTest();
        test.testGetAllUsers();
        test.testFindByID();
        test.testFindByPersonalCode();
        test.testFindByFirstName();
        test.testFindByLastName();
        test.testDelete();
    }

    public UUID[] addNewUsers(UserRepository userRepository) {
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

        return new UUID[] {user1Id, user2Id, user3Id};
    }

    public void testGetAllUsers() {
        UserRepository userRepository = new UserRepository();
        addNewUsers(userRepository);
        UserEntity[] users = userRepository.findAll();
        testUsers(users[0], users[1], users[2], "Testing all found users:");
    }

    public void testFindByID() {
        UserRepository userRepository = new UserRepository();
        UUID[] ids = addNewUsers(userRepository);
        UserEntity foundUser1 = userRepository.findById(ids[0]);
        UserEntity foundUser2 = userRepository.findById(ids[1]);
        UserEntity foundUser3 = userRepository.findById(ids[2]);
        testUsers(foundUser1, foundUser2, foundUser3, "Testing users found by ID:");
    }

    public void testFindByPersonalCode() {
        UserRepository userRepository = new UserRepository();
        addNewUsers(userRepository);
        UserEntity foundUser1 = userRepository.findByPersonalCode("66684565220");
        UserEntity foundUser2 = userRepository.findByPersonalCode("42432651636");
        UserEntity foundUser3 = userRepository.findByPersonalCode("72505954901");
        testUsers(foundUser1, foundUser2, foundUser3, "Testing users found by personal code:");
    }

    public void testFindByFirstName() {
        UserRepository userRepository = new UserRepository();
        addNewUsers(userRepository);
        UserEntity foundUser1 = userRepository.findByFirstName("Zachary");
        UserEntity foundUser2 = userRepository.findByFirstName("Jarrett");
        UserEntity foundUser3 = userRepository.findByFirstName("Jair");
        testUsers(foundUser1, foundUser2, foundUser3, "Testing users found by first name:");
    }

    public void testFindByLastName() {
        UserRepository userRepository = new UserRepository();
        addNewUsers(userRepository);
        UserEntity foundUser1 = userRepository.findByLastName("Peterson");
        UserEntity foundUser2 = userRepository.findByLastName("Bates");
        UserEntity foundUser3 = userRepository.findByLastName("Dudley");
        testUsers(foundUser1, foundUser2, foundUser3, "Testing users found by last name:");
    }

    public void testDelete() {
        UserRepository userRepository = new UserRepository();
        UUID[] ids = addNewUsers(userRepository);
        UserEntity foundUser1 = userRepository.findById(ids[0]);
        UserEntity foundUser2 = userRepository.findById(ids[1]);
        UserEntity foundUser3 = userRepository.findById(ids[2]);
        UUID user1Id = foundUser1.getId();
        UUID user2Id = foundUser2.getId();
        UUID user3Id = foundUser3.getId();
        userRepository.delete(user1Id);
        userRepository.delete(user2Id);
        userRepository.delete(user3Id);
        UserEntity[] users = userRepository.findAll();
        assertDeletionTestResult(users[0], "First user deleted test: ");
        assertDeletionTestResult(users[1], "Second user deleted test: ");
        assertDeletionTestResult(users[2], "Third user deleted test: ");
    }

    public void testUsers(UserEntity user1, UserEntity user2, UserEntity user3, String testTitle) {
        System.out.println(testTitle);
        System.out.println();
        testAllUserDetails(user1, "66684565220", "Zachary", "Peterson", "First user's");
        testAllUserDetails(user2, "42432651636", "Jarrett", "Bates", "Second user's");
        testAllUserDetails(user3, "72505954901", "Jair", "Dudley", "Third user's");
        System.out.println();
    }

    public void testAllUserDetails(UserEntity user, String personalCode, String firstName, String lastName, String testDescription) {
        assertTestResult(personalCode, user.getPersonalCode(), testDescription + " personal code test");
        assertTestResult(firstName, user.getFirstName(),  testDescription + " first name test");
        assertTestResult(lastName, user.getLastName(), testDescription + " last name test");
    }

    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result = " + realResult);
        }
    }

    private void assertDeletionTestResult(UserEntity user, String testName) {
        if (user == null) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println(user.getFirstName());
        }
    }
}
