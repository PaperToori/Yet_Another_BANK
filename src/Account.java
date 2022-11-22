import javax.management.openmbean.OpenMBeanConstructorInfoSupport;
import java.util.ArrayList;

public class Account {
    // Variables
    Customer owner;
    int id;
    Boolean claimed = false;

    // Constructors
    public Account (int id){
        this.id = id;
    }
    public Account(Customer c, int id){
        this.owner = c;
        this.id = id;
        this.claimed = true;
    }

    // Methods
    public void claim(Customer c){ this.owner = c; }
}
