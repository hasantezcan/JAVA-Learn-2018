/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class CDAccount extends BasicAccount {

    double transactionPercent;
    public CDAccount(String name, double balance) {
        super(name, balance);
        transactionPercent = 20;
        interestPercent = 15;
    }
    
    @Override
    public void withdrow(double amount)
    {
        super.withdrow(amount);
        if(currentMonth<12)
            balance -= balance/100*transactionPercent;
    }
    
    @Override
    public double computeInterest()
    {
        if(currentMonth == 12)
        {
            currentMonth = 0;
            return balance/100*interestPercent;
        }
        return 0;
    }
    
}
