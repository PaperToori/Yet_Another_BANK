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
    }

    public Customer(ArrayList<Account> acc, String name, String pNum, int id) {
        try {
            this.name = name;
            this.pNum = pNum;
            if (acc.contains(id)) {
                for (Account a : acc) {
                    if (a.id == id && a.claimed) {
                        System.out.println("Account " + a.id + " has already been claimed");
                        throw new Exception();
                    } else if (a.id == id && !a.claimed) {
                        oAcc.add(a);
                        a.claim(this);
                        System.out.println("You have claimed this account.");
                        break;
                    }
                }
            } else {
                int k = 0;
                for (Account c : acc) {
                    k++;
                }
                acc.add(new Account(this, k));
            }
        } catch (Exception e) {
            System.out.println("User Creation failed. Try again.");
        }

    } // Finished for now. Test this in bankTest(); just to be sure.

    // Methods
    public void printAcc() { // This prints the info for all accounts owned by a user. Ned to make it respond to the subclasses aswell. Perhaps by using @override
        for (Account a : oAcc) {
            System.out.println("-- Account --");
            System.out.println("ID >  " + a.id);
        }
    }

}
