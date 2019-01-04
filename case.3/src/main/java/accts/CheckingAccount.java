package accts;

/**
 * Created by USER on 4/01/2019.
 */
public class CheckingAccount extends Account {

    private double odLimit;

    public double getOdLimit() {
        return odLimit;
    }

    public void setOdLimit(double odLimit) {
        this.odLimit = odLimit;
    }
}
