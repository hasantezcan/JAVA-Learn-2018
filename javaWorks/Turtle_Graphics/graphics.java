package Turtle_Graphics;

import com.sun.javafx.scene.traversal.Direction;
import java.awt.Point;

public class graphics {
    int room[][]= new int[20][20];
        
    enum PenStates {UP,DOWN};
    
    PenStates penState;
    
    Point currentPos;   //biz yazmadık hazrıda vardı onu kullandık
    
    enum Directions{LEFT,RIGHT,UP,DOWN};
    Directions currentDirection;
    
    
    public graphics(){
        
        room =new int[20][20];
        penState = PenStates.UP;
        currentPos = new Point (0,0);
        currentDirection = Directions.RIGHT;
    }
    
    
    
    
    public void penUp(){
        penState = PenStates.UP;
    }
    
    
    public void penDown(){
        penState = PenStates.DOWN;
    }
    
    public void turnRight(){
        if (currentDirection == Directions.UP)
            currentDirection = Directions.RIGHT;
        
        else if (currentDirection == Directions.RIGHT) 
            currentDirection = Directions.DOWN;
            
        else if (currentDirection == Directions.DOWN)
            currentDirection = Directions.LEFT;
        
        else if (currentDirection == Directions.LEFT)
            currentDirection =Directions.UP;
    }
    
    public void turnLeft(){
        if (currentDirection == Directions.UP)
            currentDirection = Directions.LEFT;
        
        else if (currentDirection == Directions.LEFT) 
            currentDirection = Directions.DOWN;
            
        else if (currentDirection == Directions.DOWN)
            currentDirection = Directions.RIGHT;
        
        else if (currentDirection == Directions.RIGHT)
            currentDirection = Directions.UP;
    }
    
    public void move(int space){
        if (currentDirection == Directions.RIGHT){
                currentPos.y += space;
                if (penState == PenStates.DOWN){
                    for (int i = 1; i <= space; i++) 
                        room[currentPos.x][currentPos.y+i] = 1;
                 
                }
                currentPos.y += space;
        }
        
        else if (currentDirection == Directions.LEFT){
                currentPos.y += space;
                if (penState == PenStates.DOWN){
                    for (int i = 1; i <= space; i++) 
                        room[currentPos.x][currentPos.y-i] = 1;
                }
                currentPos.y -= space;
        }
        
        else if (currentDirection == Directions.UP){
                currentPos.y += space;
                if (penState == PenStates.DOWN){
                    for (int i = 1; i <= space; i++) 
                        room[currentPos.x-i][currentPos.y] = 1;
                }
                currentPos.x -= space;
        }
        
        
        else if (currentDirection == Directions.DOWN){
                currentPos.y += space;
                if (penState == PenStates.DOWN){
                    for (int i = 1; i <= space; i++) 
                        room[currentPos.x+i][currentPos.y] = 1;
                }
                currentPos.x += space;
        
        
            
    }
    }
    
        public void Display(){
            System.out.println("############");
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if(room[i][j]== 1)
                        System.out.print(" 0");
                    else
                        System.out.print(" -");
                }
                System.out.println("");
            }
            
        }
    
    
}
