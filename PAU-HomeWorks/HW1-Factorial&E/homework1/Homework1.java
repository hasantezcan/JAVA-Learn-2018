
package homework1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
         //----First Part
        double factorial = 1;
        System.out.print("Please enter a number=");
        
        Scanner sc= new Scanner(System.in);
        int f = sc.nextInt();
        
        for(int i=1; i<=f; i++){
            factorial = factorial * i;
        }
        
        System.out.println(f+" Factorial =" +factorial);
        
        //----Second Part
        float decimal=0;
        System.out.print("Set the decimals=");
        
        int d= sc.nextInt();
        
        for(int i=1; i<=d; i++){
            decimal+=(float)1/factorial(i);
        }
        
        decimal=decimal+1;
        System.out.print("e = "+decimal);
        
    }
    
    public static int factorial(int N){
        int factorial=1;
        for(int i=1; i<=N; i++){
            factorial = factorial * i;
            }
        
        return factorial;
        }
}
