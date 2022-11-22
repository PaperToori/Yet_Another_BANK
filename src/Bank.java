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
        Customer c = new Customer(acc, "Berry", "110101", 12345);
    }

    public void testBank() {
        users.add(new Customer("Berry", "202020"));
        System.out.println("User added");
        acc.add(new Account(101));
        System.out.println("Account added;");

        for (Customer c : users) {
            System.out.println(c.name);
        }
    }
}
