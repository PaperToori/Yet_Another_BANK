import com.sun.jdi.event.ExceptionEvent;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // Variables
    String name;
    String pNum;
    ArrayList<Account> oAcc;

    // Constructors
    public Customer(String name, String pNum) {
        this.name = name;
        this.pNum = pNum;
        this.oAcc = new ArrayList<Account>();
    }

    // Methods
    public void printAcc() { // This prints the info for all accounts owned by a user. Ned to make it respond to the subclasses aswell. Perhaps by using @override
        try {
            for (Account a : oAcc) {
                System.out.println("-- Account(s) --");
                System.out.println("ID >  " + a.id);
            }
        } catch (Exception e) {
            System.out.println("-- Account(s) --");
            System.out.println("> No accounts are connected to this user.");
        }
    }

    public Bank crOwAcc(Bank bank) { // Creates account that is already owned by Customer upon construction.
        return bank;
    }

}
