/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class MinimumAccount extends BasicAccount{
    
    
    double penaltyAmount;
    double penaltyLimit;
    
    public MinimumAccount(String name, double balance)
    {
        super(name,balance);
        penaltyAmount = 10.00;
    }
    
    public double computePenalty()
    {
        if(balance < penaltyLimit)
            return penaltyAmount;
        else
            return 0.00;
    }
    
    @Override
    public void montlyUpdate()
    {
        super.montlyUpdate();
        balance -= computePenalty();
    }
    
}
