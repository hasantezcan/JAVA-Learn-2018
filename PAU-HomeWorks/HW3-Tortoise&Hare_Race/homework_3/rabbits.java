package homework_3;

import java.util.Random;


public class rabbits {
    private String name;
    private int rabbitStep;
    private int rabbitLocation; 

    public rabbits(String name) {
        this.rabbitLocation = 0;
        this.name = name;
    }

    public int getRabbitStep() {
        return rabbitStep;
    }

    public void setRabbitStep(int rabbitStep) {
        this.rabbitStep = rabbitStep;
    }

    public int getRabbitLocation() {
        return rabbitLocation;
    }

    public void setRabbitLocation(int rabbitLocation) {
        this.rabbitLocation = rabbitLocation;
    }
    
    public String getName() {
        return name;
    }
   
    
    public void Move(){
       
        
        System.out.print(name+"       ");
        
            Random rNesne = new Random();
            int iht = rNesne.nextInt(10)+1; //rastgele sayi üretir.  
                        
                        if(iht>0 && iht<=2)//SLEEP
				rabbitStep = 0;
			else if(iht>2 && iht<=4)//BIG HOP
				rabbitStep = 9;
			else if(iht>4 && iht<=5)//BIG SLIP
				rabbitStep = -12;
			else if(iht>5 && iht<=8)//SMALL HOP
				rabbitStep = 1;
			else if(iht>8 && iht<=10)//SMALL SLIP
				rabbitStep = -2;
         
           rabbitLocation += rabbitStep;  
           
           
           if (rabbitLocation <= 0) 
               rabbitLocation =0; // Bu seyede tavşanın yer belirletici sıfırın altına düşemeyecek.
           
           if (rabbitLocation >= 70) 
               rabbitLocation =70; //70 sınırı kesin şekilde belirtildi.
           
     }
 
    public void Print(){
        
        for (int i = 0; i<=70; i++) {
               if (rabbitLocation == i) 
                   System.out.print("H"); //HARE
               else     
                   System.out.print("-");
           }
           
        System.out.println();
    }
}
