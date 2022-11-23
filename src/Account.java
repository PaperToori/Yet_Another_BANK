import javax.management.openmbean.OpenMBeanConstructorInfoSupport;
import java.util.ArrayList;

public class Account {
    // Variables
    Customer owner;
    int id;
    Boolean claimed = false;

    // Constructors
    public Account() {
    }

    public Account(int id) {
        this.id = id;
    }

    public Account(Customer c, int id) {
        this.owner = c;
        c.oAcc.add(this);
        this.id = id;
        this.claimed = true;
    }

    // Methods
    public void claim(Customer c) {
        this.owner = c;
        claimed = true;
        c.oAcc.add(this);
    }
}
