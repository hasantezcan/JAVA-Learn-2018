/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class Accounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CDAccount obj1 = new CDAccount("ahmet", 1010.0);
        obj1.montlyUpdate();
        System.out.println(obj1.getBalance());//1000
        obj1.withdrow(950);
        System.out.println(obj1.getBalance());//40
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        obj1.montlyUpdate();
        System.out.println(obj1.getBalance());//36
        
        
        
       
    }
}
