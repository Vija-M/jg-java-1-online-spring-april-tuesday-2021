package students.linda_junkina.lesson_12.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.findByUid();
    }

    public void findByUid(){
        BankClient client1 = new BankClient("1", "John Doe");
        BankClient client2 = new BankClient("2", "Sarah Doe");

        List<BankClient> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        BankApi api = new BankApiImpl(clients);
//        checkTestResult("John Doe", api.findByUid(api., "1"));
    }



    private void checkTestResult(BankClient expected,  BankClient actual) {
        if (expected.equals(actual)) {
            System.out.println("Find bank client - OK!");
        } else {
            System.out.println("Find bank client - FAIL!");
        }
    }

}
