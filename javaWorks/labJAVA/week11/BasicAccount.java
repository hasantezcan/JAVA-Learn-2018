/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class BasicAccount {
    
    String name;
    double balance;
    int currentMonth;
    double feeAmount;
    double feePercent;
    double interestPercent;

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
    
    public BasicAccount(String name,double balance)
    {
        this.name = name;
        this.balance = balance;
        currentMonth = 0;
        feeAmount = 10.0;
        feePercent = 10.0;
        interestPercent = 0.0;
    }
    
    public void deposit(double amount)
    {
        if(amount>10)
            balance += amount;
        else
            System.out.println("You can not deposit smaller than 10.00 TL");
    }
    
    public void withdrow(double amount)
    {
        if(amount>0 || amount<= balance)
            balance -= amount;
        else
            System.out.println("You cannot withdrow with this amount");
    }
    
    public double computeFee()
    {
        return feeAmount <= balance/100*feePercent 
                ? feeAmount : balance/100*feePercent;
    }
    
    public double computeInterest()
    {
        if(balance > 0)
            return (balance/100*interestPercent)/12;
        else
            return 0.00;
    }
    
    public void montlyUpdate()
    {
        currentMonth++;
        balance -= computeFee();
        balance += computeInterest();
    }
}
