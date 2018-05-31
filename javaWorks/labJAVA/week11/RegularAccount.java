/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class RegularAccount extends MinimumAccount{
    
    public RegularAccount(String name, double balance)
    {
        super(name,balance);
        penaltyLimit = 500.00;
    }
}
