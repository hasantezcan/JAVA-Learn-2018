package homework_3;

import java.util.Random;


public class turtle {
    
    private String name;
    private int turtleStep;
    private int turtleLocation; 

    public int getTurtleStep() {
        return turtleStep;
    }

    public void setTurtleStep(int turtleStep) {
        this.turtleStep = turtleStep;
    }

    public int getTurtleLocation() {
        return turtleLocation;
    }

    public void setTurtleLocation(int turtleLocation) {
        this.turtleLocation = turtleLocation;
    }

    public turtle(String name) {
        this.name = name;
        this.turtleLocation = 0;
    }
    
    public String getName() {
        return name;
    }
    
    
    
    
    public void Move(){      
            System.out.print(name+"  ");
           
            Random rNesne = new Random();
            int iht = rNesne.nextInt(10)+1; //rastgele sayi üretir.
        
                        if(iht>0 && iht<=5) //FAST PLOD
				turtleStep = 3;
			else if(iht>5 && iht<=7)//SLIP
				turtleStep = -6;
			else if(iht>7 && iht<=10)//SLOW PLOD
				turtleStep = 1;
           
           turtleLocation += turtleStep;
           
           if (turtleLocation <= 0) 
               turtleLocation =0; // Bu seyede kaplumbağanın yer belirletici sıfırın altına düşemeyecek.
           
           if (turtleLocation >= 70) 
               turtleLocation =70;
          
        }      
        
    public void Print(){
        
           for (int i = 0; i<=70; i++) {
               if (turtleLocation == i) 
                   System.out.print("T"); //TORTOISE 
               else     
                   System.out.print("-");
            }                  
        System.out.println();
    }
}
