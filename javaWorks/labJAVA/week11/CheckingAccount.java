/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class CheckingAccount extends MinimumAccount {

    double transectionAmount;
    
    public CheckingAccount(String name, double balance) {
        super(name, balance);
        penaltyLimit = 100.00;
        interestPercent = 7;
        transectionAmount = 0.10;
    }
    
    @Override
    public void withdrow(double amount)
    {
        super.withdrow(amount);
        balance -= transectionAmount;
    }

}
