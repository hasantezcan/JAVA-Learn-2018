package Turtle_Graphics;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
    
        
        int selection = 0;
        
        String str[];
        
        Scanner scan = new Scanner(System.in);
        graphics t = new graphics();
        
        while(selection != 9){
            
            System.out.println("1-Pen Off");
            System.out.println("2-Pen On");
            System.out.println("3-TurnRight");
            System.out.println("4-TurnLeft");
            System.out.println("5-Move !!! --->   (5'Move Command' , Step Number )");
            System.out.println("6-Display/Simulate");
            System.out.println("9-EXIT!");
                    
            
            System.out.print("\nChose a action:   ");
            
            str = scan.nextLine().split(",");
            
            selection = Integer.parseInt(str[0]);
            switch(selection){
                case 1:
                    t.penUp();
                    break;
                case 2:
                    t.penDown();
                    break;
                case 3:
                    t.turnRight();
                    break;
                case 4:
                    t.turnLeft();
                    break;
                case 5:
                    t.move(Integer.parseInt(str[1]));
                    break;
                case 6:
                    t.Display();
                    break;
                case 9:
                    System.out.println("Thanks For Playing");
                    break;
                    
                default:
                    System.out.println("Unknown selection");
                    
            }
                
            
        }
            
        
        
    }
}
