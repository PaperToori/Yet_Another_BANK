public class Savings extends Account {
    // Variables
    double bal = 0;
    double rent = 0;

    // Constructors
    public Savings() {
    }

    public Savings(int id) {
        this.id = id;
    }

    public Savings(int id, Customer c) {
        this.id = id;
        this.owner = c;
        this.claimed = true;
    }

    // Methods
    public void addBal(double b) {
        this.bal += b;
    }

    public void remBal(double b) {
        this.bal -= b;
    }

    public void setRent(double r) {
        this.rent = r;
    }
}
