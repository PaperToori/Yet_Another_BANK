import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Variables
    ArrayList<Customer> users;
    ArrayList<Account> acc;

    // Constructors
    public Bank() {
        users = new ArrayList<Customer>();
        acc = new ArrayList<Account>();
    }

    // Methods
    public void runBank() {


    }

    public void testBank() {
        users.add(new Customer("Berry", "202020"));
        System.out.println("User added");
        acc.add(new Account(101));
        System.out.println("Account added;");
        users.get(0).printAcc();
        acc.get(0).claim(users.get(0));
        System.out.println(users.get(0).name + " has claimed " + acc.get(0).id);
        users.get(0).printAcc();

        for (Customer c : users) {
            System.out.println(c.name);
        }
    }
}
